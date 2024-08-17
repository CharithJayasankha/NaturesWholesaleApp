package controller;

import db_helper.Database;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import model.Customer;

import java.net.URL;
import java.util.ResourceBundle;


public class AddCustomer implements Initializable {

    @FXML
    private TextField idText;


    @FXML
    private Button add;

    @FXML
    private TextField name;

    @FXML
    private TextField address;

    @FXML
    private TextField number;

    @FXML
    private DatePicker datePicker;

    @FXML
    private ChoiceBox<String> title;

    private String[] titleList = {"Mr","Mis"};

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        title.getItems().addAll(titleList);
    }
    @FXML
    void addBtn(ActionEvent event) {
        Database database = Database.getDatabase();
        Customer customer = new Customer(idText.getText(),title.getValue(),name.getText(),address.getText(),number.getText(),datePicker.getValue().toString());
        database.addData(customer);
        add.setVisible(false);
    }

}
