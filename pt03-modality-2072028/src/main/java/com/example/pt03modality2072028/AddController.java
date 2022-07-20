package com.example.pt03modality2072028;

import com.example.pt03modality2072028.model.ItemKopi;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class AddController {

    public TextField inputNama2;
    public TextField inputHarga2;
    public ComboBox combobox2;
    public Button buttonDisc2;
    public Button btnAddMenu2;

    public String getDiskonCombo() {
        return diskonCombo;
    }

    public void setDiskonCombo(String diskonCombo) {
        this.diskonCombo = diskonCombo;
    }

    String diskonCombo;

    private ObservableList<Double> discountList;

    public String getNilaiCustomDiscount() {
        return nilaiCustomDiscount;
    }

    public void setNilaiCustomDiscount(String nilaiCustomDiscount) {
        this.nilaiCustomDiscount = nilaiCustomDiscount;
    }

    String nilaiCustomDiscount;
    String ambilNama;

    public String getAmbilNama() {
        return ambilNama;
    }

    public void setAmbilNama(String ambilNama) {
        this.ambilNama = ambilNama;
    }

    public String getAmbilHarga() {
        return ambilHarga;
    }

    public void setAmbilHarga(String ambilHarga) {
        this.ambilHarga = ambilHarga;
    }

    String ambilHarga;

    Stage addDiscountStage;

    public void initialize() {
        addDiscountStage = new Stage();
        discountList = FXCollections.observableArrayList();
        discountList.add(0.0);
        discountList.add(0.1);
        discountList.add(0.2);
        discountList.add(0.3);
        discountList.add(0.4);
        discountList.add(0.5);
        discountList.add(0.6);
        discountList.add(0.7);
        discountList.add(0.8);
        discountList.add(0.9);
        combobox2.setItems(discountList);
        combobox2.getSelectionModel().select(0);
    }

    public void goAddDiscount(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("discount-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 250, 148);

        DiscountController dc = fxmlLoader.getController();

        addDiscountStage.setTitle("Hello!");
        addDiscountStage.setScene(scene);
        addDiscountStage.showAndWait();
        buttonDisc2.setText(Double.toString(Double.parseDouble(dc.getBesarDiskon()) / 100));
    }

    public void confirmAddMenu(ActionEvent actionEvent) {
        setAmbilNama(inputNama2.getText());
        setAmbilHarga(inputHarga2.getText());
        setNilaiCustomDiscount(buttonDisc2.getText());
        setDiskonCombo(combobox2.getValue().toString());
        ((Node) actionEvent.getSource()).getScene().getWindow().hide();
    }
}
