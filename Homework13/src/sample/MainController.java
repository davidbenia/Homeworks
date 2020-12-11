package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class MainController{
    Parent ttt_root, calc_root;
    Scene ttt_scn, calc_scn;

    public void Calc(ActionEvent event){
        try{
            calc_root = FXMLLoader.load(getClass().getResource("CalcWindow.fxml"));
            calc_scn = new Scene(calc_root);
        }
        catch (Exception exep){
            exep.printStackTrace();
        }

        System.out.println("Loading Calculator.");
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(calc_scn);
        stage.setTitle("Calculator");
    }

    public void TTT(ActionEvent event){
        try{
            ttt_root = FXMLLoader.load(getClass().getResource("TttWindow.fxml"));
            ttt_scn = new Scene(ttt_root);
        }
        catch (Exception exep){
            exep.printStackTrace();
        }

        System.out.println("Loading TicTacToe.");
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(ttt_scn);
        stage.setTitle("TicTacToe");
    }
}
