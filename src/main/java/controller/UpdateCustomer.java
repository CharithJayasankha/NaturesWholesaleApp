package controller;

import db_helper.Database;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import lombok.Setter;
import model.Customer;

import java.net.URL;
import java.util.ResourceBundle;

@Setter
public class UpdateCustomer implements Initializable {
    private Customer customer;

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
        System.out.println(customer);
    }
    @FXML
    void addBtn(ActionEvent event) {

        add.setVisible(false);
    }

}
