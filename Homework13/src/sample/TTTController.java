package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class TTTController {
    Parent main_root;
    Scene main_scn;

    @FXML
    Button zerozero_btn;
    @FXML
    Button zeroone_btn;
    @FXML
    Button zerotwo_btn;
    @FXML
    Button onezero_btn;
    @FXML
    Button oneone_btn;
    @FXML
    Button onetwo_btn;
    @FXML
    Button twozero_btn;
    @FXML
    Button twoone_btn;
    @FXML
    Button twotwo_btn;
    @FXML
    Label label;

    String button_value;
    int cpu_spot = 1, valid_spots = 0, count = 0, winner = 0;
    LinkedList<Integer> cpu_spots = new LinkedList<>();
    Random rand = new Random();

    public void CPU_Player(){
        if(valid_spots < 4){
            int test = (cpu_spot = rand.nextInt(9) + 1);
            while(true){
                if(cpu_spots.contains(test)) {
                    System.out.println("Contains " + test);
                    test = (cpu_spot = rand.nextInt(9) + 1);
                }
                else {
                    System.out.println("Unique test " + test);
                    cpu_spots.add(test);
                    break;
                }
            }

            if(cpu_spot == 1){
                if(zerozero_btn.getText().equals("") && winner != 1) {
                    zerozero_btn.setText("O");
                    valid_spots++;
                    count++;
                }
                else
                    CPU_Player();
            }
            else if(cpu_spot == 2){
                if(zeroone_btn.getText().equals("") && winner != 1) {
                    zeroone_btn.setText("O");
                    valid_spots++;
                    count++;
                }
                else
                    CPU_Player();
            }
            else if(cpu_spot == 3){
                if(zerotwo_btn.getText().equals("") && winner != 1) {
                    zerotwo_btn.setText("O");
                    valid_spots++;
                    count++;
                }
                else
                    CPU_Player();
            }
            else if(cpu_spot == 4){
                if(onezero_btn.getText().equals("") && winner != 1) {
                    onezero_btn.setText("O");
                    valid_spots++;
                    count++;
                }
                else
                    CPU_Player();
            }
            else if(cpu_spot == 5){
                if(oneone_btn.getText().equals("") && winner != 1) {
                    oneone_btn.setText("O");
                    valid_spots++;
                    count++;
                }
                else
                    CPU_Player();
            }
            else if(cpu_spot == 6){
                if(onetwo_btn.getText().equals("") && winner != 1) {
                    onetwo_btn.setText("O");
                    valid_spots++;
                    count++;
                }
                else
                    CPU_Player();
            }
            else if(cpu_spot == 7){
                if(twozero_btn.getText().equals("") && winner != 1) {
                    twozero_btn.setText("O");
                    valid_spots++;
                    count++;
                }
                else
                    CPU_Player();
            }
            else if(cpu_spot == 8){
                if(twoone_btn.getText().equals("") && winner != 1) {
                    twoone_btn.setText("O");
                    valid_spots++;
                    count++;
                }
                else
                    CPU_Player();
            }
            else if(cpu_spot == 9){
                if(twotwo_btn.getText().equals("") && winner != 1) {
                    twotwo_btn.setText("O");
                    valid_spots++;
                    count++;
                }
                else
                    CPU_Player();
            }
        }
    }

    public void Game(ActionEvent event){
        button_value = ((Button)event.getSource()).getText();

        if(button_value.equals("") && winner != 1){
            ((Button)event.getSource()).setText("X");
            CPU_Player();
            count++;
        }

        Winner();
    }

    public void Winner(){
        if((zerozero_btn.getText().equals("X") && zeroone_btn.getText().equals("X") && zerotwo_btn.getText().equals("X"))
        || (onezero_btn.getText().equals("X") && oneone_btn.getText().equals("X") && onetwo_btn.getText().equals("X"))
        || (twozero_btn.getText().equals("X") && twoone_btn.getText().equals("X") && twotwo_btn.getText().equals("X"))
        || (zerozero_btn.getText().equals("X") && oneone_btn.getText().equals("X") && twotwo_btn.getText().equals("X"))
        || (twozero_btn.getText().equals("X") && oneone_btn.getText().equals("X") && zerotwo_btn.getText().equals("X"))
        || (zerozero_btn.getText().equals("X") && onezero_btn.getText().equals("X") && twozero_btn.getText().equals("X"))
                || (zeroone_btn.getText().equals("X") && oneone_btn.getText().equals("X") && twoone_btn.getText().equals("X"))
                || (zerotwo_btn.getText().equals("X") && onetwo_btn.getText().equals("X") && twotwo_btn.getText().equals("X"))){
            label.setText("Player has Won!");
            System.out.println("player won");
            winner = 1;
        }
        else if((zerozero_btn.getText().equals("O") && zeroone_btn.getText().equals("O") && zerotwo_btn.getText().equals("O"))
                || (onezero_btn.getText().equals("O") && oneone_btn.getText().equals("O") && onetwo_btn.getText().equals("O"))
                || (twozero_btn.getText().equals("O") && twoone_btn.getText().equals("O") && twotwo_btn.getText().equals("O"))
                || (zerozero_btn.getText().equals("O") && oneone_btn.getText().equals("O") && twotwo_btn.getText().equals("O"))
                || (twozero_btn.getText().equals("O") && oneone_btn.getText().equals("O") && zerotwo_btn.getText().equals("O"))
                || (zerozero_btn.getText().equals("O") && onezero_btn.getText().equals("O") && twozero_btn.getText().equals("O"))
                || (zeroone_btn.getText().equals("O") && oneone_btn.getText().equals("O") && twoone_btn.getText().equals("O"))
                || (zerotwo_btn.getText().equals("O") && onetwo_btn.getText().equals("O") && twotwo_btn.getText().equals("O"))){
            label.setText("CPU has Won!");
            System.out.println("cpu won");
            winner = 1;
        }
        else if(count == 9){
            label.setText("Tie!");
            System.out.println("tie");
            winner = 1;
        }
    }

    public void Restart(){
        label.setText("Game in Progress");
        zerozero_btn.setText("");
        zeroone_btn.setText("");
        zerotwo_btn.setText("");
        onezero_btn.setText("");
        oneone_btn.setText("");
        onetwo_btn.setText("");
        twozero_btn.setText("");
        twoone_btn.setText("");
        twotwo_btn.setText("");
        cpu_spots.clear();
        valid_spots = 0;
        count = 0;
        winner = 0;
    }

    public void MainMenu(ActionEvent event){
        try{
            main_root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
            main_scn = new Scene(main_root);
        }
        catch (Exception exep){
            exep.printStackTrace();
        }

        System.out.println("Applications Menu.");
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(main_scn);
        stage.setTitle("Applications");
    }
}
