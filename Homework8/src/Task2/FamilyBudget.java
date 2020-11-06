package Task2;

import javax.annotation.processing.SupportedSourceVersion;
import java.io.*;

public class FamilyBudget {
    private File file = new File("./src/Task2/budget.txt");
    private BufferedWriter bufferedWriter;
    private int money;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
        deleteFiles();
        moneyState();
    }

    synchronized public String changeMoney(int difference){
        if(difference <= getMoney()) {
            this.money -= difference;
            moneyState();
            return "";
        }
        else
            return "failed to get money";
    }

    public void familyStatus(){
        if(money >= 40000)
            System.out.println("Rich Family");
        else if(money >= 10000)
            System.out.println("Medium Family");
        else
            System.out.println("Poor Family");
    }

    private void moneyState(){
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file, true));
            bufferedWriter.write(money + "\n");
            bufferedWriter.close();

        } catch (IOException e) {
            System.out.println("---Error---");
        }
    }

    private static void deleteFiles(){
        File file = new File("./src/Task2/budget.txt");

        if(file.exists())
            file.delete();
    }
}
