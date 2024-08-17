package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class HomePage {

    SearchCustomer searchCustomer;

    @FXML
    void addBtn(ActionEvent event) {
        Stage stage = new Stage();
        try {
            FXMLLoader loader = new  FXMLLoader(getClass().getResource("../view/addCustomer.fxml"));
            stage.setScene(new Scene(loader.load()));
            stage.setTitle("Nature's Wholesale - Add Customer");
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void deleteBtn(ActionEvent event) {
        Stage stage = new Stage();
        try {
            FXMLLoader loader = new  FXMLLoader(getClass().getResource("../view/searchCustomer.fxml"));
            stage.setScene(new Scene(loader.load()));
            searchCustomer = loader.getController();
            searchCustomer.setPageIndex(2);
            searchCustomer.setSearchStage(stage);
            stage.setTitle("Nature's Wholesale - Delete Customer");
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void searchBtn(ActionEvent event) {
        Stage stage = new Stage();
        try {
            FXMLLoader loader = new  FXMLLoader(getClass().getResource("../view/searchCustomer.fxml"));
            stage.setScene(new Scene(loader.load()));
            searchCustomer = loader.getController();
            searchCustomer.setPageIndex(3);
            searchCustomer.setSearchStage(stage);
            stage.setTitle("Nature's Wholesale - Search Customer");
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void updateBtn(ActionEvent event) {
        Stage stage = new Stage();

        try {
            FXMLLoader loader = new  FXMLLoader(getClass().getResource("../view/searchCustomer.fxml"));
            stage.setScene(new Scene(loader.load()));
            searchCustomer = loader.getController();
            searchCustomer.setPageIndex(1);
            searchCustomer.setSearchStage(stage);
            stage.setTitle("Nature's Wholesale - Update Customer");
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @FXML
    void viewBtn(ActionEvent event) {
        Stage stage = new Stage();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/viewCustomer.fxml"))));
            stage.setTitle("Nature's Wholesale - View All Customer");
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
