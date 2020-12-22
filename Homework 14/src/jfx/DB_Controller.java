package jfx;

import database.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.net.URL;
import java.sql.ResultSet;
import java.util.ResourceBundle;

public class DB_Controller implements Initializable {

    DB database = new DB();

    @FXML
    TextField txt_id;
    @FXML
    TextField txt_deal;
    @FXML
    TextField txt_city;
    @FXML
    TextField txt_district;
    @FXML
    TextField txt_residence;
    @FXML
    TextField txt_rooms;
    @FXML
    TextField txt_price;
    @FXML
    TextArea txtAr_description;

    @FXML
    TableView<MyModel> table;
    @FXML
    TableColumn<MyModel, Integer> col_id;
    @FXML
    TableColumn<MyModel, String> col_deal;
    @FXML
    TableColumn<MyModel, String> col_city;
    @FXML
    TableColumn<MyModel, String> col_district;
    @FXML
    TableColumn<MyModel, String> col_residence;
    @FXML
    TableColumn<MyModel, String> col_rooms;
    @FXML
    TableColumn<MyModel, String> col_price;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        col_id.setCellValueFactory(new PropertyValueFactory("id"));
        col_deal.setCellValueFactory(new PropertyValueFactory("Deal"));
        col_city.setCellValueFactory(new PropertyValueFactory("City"));
        col_district.setCellValueFactory(new PropertyValueFactory("District"));
        col_residence.setCellValueFactory(new PropertyValueFactory("Residence"));
        col_rooms.setCellValueFactory(new PropertyValueFactory("Rooms"));
        col_price.setCellValueFactory(new PropertyValueFactory("Price"));
    }

    public void Select(){
        int id;
        String deal, location, specific_location, product, price, rooms, description;
        ResultSet resultSet;
        txtAr_description.setText("");
        table.getItems().clear();

        try{
            resultSet = database.select();

            while (resultSet.next()){
                id = resultSet.getInt("id");
                deal = resultSet.getString("Deal");
                location = resultSet.getString("City");
                specific_location = resultSet.getString("District");
                product = resultSet.getString("Residence");
                rooms = resultSet.getString("Rooms");
                price = resultSet.getString("Price");
                description = resultSet.getString("Text");

                table.getItems().add(new MyModel(id, deal, location, specific_location, product, rooms, price));
                txtAr_description.appendText(id + "\n" + description + "\n\n");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public void Update(){
        int id;
        String deal, location, specific_location, product, price, rooms;

        try{
            id = Integer.parseInt(txt_id.getText());
            deal = txt_deal.getText();
            location = txt_city.getText();
            specific_location = txt_district.getText();
            product = txt_residence.getText();
            rooms = txt_rooms.getText();
            price = txt_price.getText();

            database.update(id, deal, location, specific_location, product, price, rooms);
            Select();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public void Delete(){
        int id;

        try{
            id = Integer.parseInt(txt_id.getText());

            database.delete(id);
            Select();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void MainWindow(ActionEvent event){
        try{
            Parent main_root = FXMLLoader.load(getClass().getResource("window.fxml"));
            Scene main_scene = new Scene(main_root);

            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(main_scene);
            stage.setTitle("Homework 14");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }


}
