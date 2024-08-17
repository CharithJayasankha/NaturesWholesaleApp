package controller;


import db_helper.Database;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import lombok.Setter;
import model.Customer;

import java.io.IOException;
@Setter
public class SearchCustomer {

    private int pageIndex;
    private Stage stage;
    private Stage searchStage;
    @FXML
    private TextField searchText;

    Database database = Database.getDatabase();

    @FXML
    void searchBtn(ActionEvent event) {
        if(database.searchDate(searchText.getText()) == -1){
            System.out.println("please Enter 'this is alert'");
            searchText.setText("");
        }else{
           Customer customer = database.getData(database.searchDate(searchText.getText()));

        switch (pageIndex){
            case 1:
                stage = new Stage();
                try {
                    FXMLLoader loader = new  FXMLLoader(getClass().getResource("../view/updateCustomer.fxml"));
                    stage.setScene(new Scene(loader.load()));
                    UpdateCustomer updateCustomer = loader.getController();
                    updateCustomer.setCustomer(customer);


                    stage.setTitle("Nature's Wholesale - Update Customer");
                    stage.show();
                    searchStage.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                break;
            case 2:
                stage = new Stage();
                try {
                    stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/deleteCustomer.fxml"))));
                    stage.setTitle("Nature's Wholesale - Delete Customer");
                    stage.show();
                    searchStage.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                break;
            default:
                stage = new Stage();
                try {
                    stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/searchCustomer.fxml"))));
                    stage.setTitle("Nature's Wholesale - search Customer");
                    stage.show();
                    searchStage.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                break;
        }
        }
    }

}
