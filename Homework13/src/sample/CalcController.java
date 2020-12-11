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

public class CalcController {
    Parent main_root;
    Scene main_scn;

    String str_formula;
    String operator;
    @FXML
    Label formula;

    public void Operate(ActionEvent event){
        operator = ((Button)event.getSource()).getText();
        str_formula = formula.getText();

        if(operator.matches("\\d") && !(str_formula.contains("="))){
            formula.setText(str_formula + operator);
        }
        else if(operator.matches("[*/+-]")){
            if(String.valueOf(str_formula.charAt(str_formula.length() - 1)).matches("\\d+") && !(str_formula.contains("="))){
                formula.setText(String.format("%s %s ", str_formula, operator));
            }
        }
    }

    public void Calculate(){
        str_formula = formula.getText();

        if(!(str_formula.isBlank())){
            if(!(String.valueOf(str_formula.charAt(str_formula.length() - 1)).matches("\\d+"))){
                str_formula = str_formula.substring(0, str_formula.length() - 3);
            }
            else if(str_formula.contains("=")){
                str_formula = str_formula.substring(0, str_formula.indexOf("=") - 1);
            }

            LinkedList<String> operators = new LinkedList<>();
            LinkedList<Integer> numbers = new LinkedList<>();
            int result = 0, i = 0, increment;

            for(String elem : str_formula.split(" ")){
                if(elem.matches("\\d+")){
                    numbers.add(Integer.parseInt(elem));
                }
                else if(elem.matches("[*/+-]")){
                    operators.add(elem);
                }
            }

            for(int j = 0; j <= (operators.size() - 1); j++){
                if(operators.get(j).equals("*")){
                    if(i < numbers.size() - 1)
                        result += numbers.get(i) * numbers.get(i+1);
                    else if (i == numbers.size() - 1)
                        result *= numbers.get(i);
                }
                else if(operators.get(j).equals("/")){
                    if(i < numbers.size() - 1)
                        result += numbers.get(i) / numbers.get(i+1);
                    else if (i == numbers.size() - 1)
                        result /= numbers.get(i);
                }
                else if(operators.get(j).equals("+")){
                    if(i < numbers.size() - 1)
                        result += numbers.get(i) + numbers.get(i+1);
                    else if (i == numbers.size() - 1)
                        result += numbers.get(i);
                }
                else if(operators.get(j).equals("-")){
                    if(i < numbers.size() - 1)
                        result += numbers.get(i) - numbers.get(i+1);
                    else if (i == numbers.size() - 1)
                        result -= numbers.get(i);
                }

                i += 2;
            }

            formula.setText(String.format("%s = %d", str_formula, result));
        }
    }

    public void Clear(){
        formula.setText("");
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
