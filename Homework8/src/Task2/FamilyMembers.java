package Task2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class FamilyMembers extends Thread {
    private File file = new File("./src/Task2/family.txt");
    private BufferedWriter bufferedWriter;
    private String first_name;
    private String last_name;
    private int age;
    private String status;
    private FamilyBudget budget;
    private int amount;

    public FamilyMembers(){ }
    public void run(){
        moneyTake();
    }

    public void setAmount(int amount){
        this.amount = amount;
    }

    public void setBudget(FamilyBudget budget){
        this.budget = budget;
    }

    public void moneyTake(){
        Random random = new Random();

        for(int i = 1; i < random.nextInt(15)+10; i++) {
            if(budget.changeMoney(amount).equals("failed to get money"))
                System.out.println(first_name + " " + this.getName() + " failed to get money: wanted " + amount + " > " + budget.getMoney());
            else
                System.out.println(first_name + " " + this.getName() + " " + budget.getMoney());
        }

        addMemberToFile();
    }

    public FamilyMembers(String first_name, String last_name, int age, String status) {
        deleteFiles();
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.status = status;
    }

    private void addMemberToFile(){
        try {
            String member = first_name + " " + last_name + " " + age + " " + status;
            bufferedWriter = new BufferedWriter(new FileWriter(file, true));
            bufferedWriter.write(member + "\n");
            bufferedWriter.close();

        } catch (IOException e) {
            System.out.println("---Error---");
        }
    }

    private static void deleteFiles(){
        File file = new File("./src/Task2/family.txt");

        if(file.exists())
            file.delete();
    }
 }
