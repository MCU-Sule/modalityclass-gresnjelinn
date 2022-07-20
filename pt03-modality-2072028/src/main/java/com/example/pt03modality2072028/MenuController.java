package com.example.pt03modality2072028;

import com.example.pt03modality2072028.model.ItemKopi;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;
public class MenuController {

    public ListView listview1;
    public Button button1;

    String diskonBaru;

    private ObservableList<ItemKopi> menuList;

    public Stage addMenuStage;

    public void initialize() {
        addMenuStage = new Stage();
        menuList = FXCollections.observableArrayList(
                new ItemKopi("Caramel Machiato", 40000, 0.1),
                new ItemKopi("Caramel Latte", 65000, 0),
                new ItemKopi("Espresso", 50000, 0),
                new ItemKopi("Mocha Latte", 62500, 0)
        );
        listview1.setItems(menuList);
    }

    public void goAddMenu(ActionEvent actionEvent) throws NumberFormatException, IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("add-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 250, 235);

        AddController ac = fxmlLoader.getController();

        addMenuStage.setTitle("Hello!");
        addMenuStage.setScene(scene);
        addMenuStage.showAndWait();

        if (ac.getNilaiCustomDiscount() == "Custom Discount") {
            diskonBaru = ac.getDiskonCombo();
        } else {
            diskonBaru = ac.getNilaiCustomDiscount();
        }

        menuList.add(new ItemKopi(ac.getAmbilNama(),
                Double.parseDouble(ac.getAmbilHarga()),
                Double.parseDouble(diskonBaru)));
    }
}
