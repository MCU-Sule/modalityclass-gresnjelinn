package com.example.pt03modality2072028;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class DiscountController {

    public TextField inputDiscount3;
    public Button btnAddDiscount3;

    public String getBesarDiskon() {
        return besarDiskon;
    }

    public void setBesarDiskon(String besarDiskon) {
        this.besarDiskon = besarDiskon;
    }

    String besarDiskon;

    public void confirmAddDiscount(ActionEvent actionEvent) throws IOException {
        setBesarDiskon(inputDiscount3.getText());
        ((Node) actionEvent.getSource()).getScene().getWindow().hide();
    }
}
