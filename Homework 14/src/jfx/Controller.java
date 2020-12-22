package jfx;

import database.DB;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class Controller {

    DB database = new DB();

    ToggleGroup toggleGroup = new ToggleGroup();
    @FXML
    Label label_radio;

    @FXML
    Button btn_email;
    @FXML
    Button btn_tel;
    @FXML
    TextArea txtAr_description;
    @FXML
    ChoiceBox selector_sellrent;
    @FXML
    ChoiceBox selector_location;
    @FXML
    ChoiceBox selector_specific_location;
    @FXML
    ChoiceBox selector_product;
    @FXML
    ChoiceBox selector_currency;
    @FXML
    TextField txt_price;


    public void AddMail(){
        txtAr_description.appendText("თქვენი_ფოსტა@test.test\n");
    }
    public void AddTel(){
        txtAr_description.appendText("XXX-XX-XX-XX\n");
    }
    public void Radio(ActionEvent event){
        ((RadioButton)event.getSource()).setToggleGroup(toggleGroup);
        ((RadioButton)event.getSource()).setSelected(true);
        label_radio.setText(((RadioButton) event.getSource()).getText());
    }

    public void Submit(){
        String deal, location, specific_location, product, currency, price, rooms, description;

        try{
            deal = selector_sellrent.getValue().toString();
            location = selector_location.getValue().toString();
            specific_location = selector_specific_location.getValue().toString();
            product = selector_product.getValue().toString();
            currency = selector_currency.getValue().toString();
            rooms = label_radio.getText();
            price = currency + " " + txt_price.getText();
            description = txtAr_description.getText();

            database.insert(deal, location, specific_location, product, price, rooms, description);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void NextWindow(ActionEvent event){
        try{
            Parent next_root = FXMLLoader.load(getClass().getResource("db_window.fxml"));
            Scene next_scene = new Scene(next_root);

            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(next_scene);
            stage.setTitle("Homework 14");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
