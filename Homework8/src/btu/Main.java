package btu;

import Task1.*;
import Task2.*;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Class1 object_1 = new Class1();

        object_1.RandomElements();
        System.out.println("\nLesser sum: " + object_1.ValueLesserSum());
        System.out.println("\nGreater product: " + object_1.IndexGreaterProduct());
        object_1.PrintEven();

        Random random = new Random();

        FamilyBudget familyBudget = new FamilyBudget();
        familyBudget.setMoney(30000);
        familyBudget.familyStatus();
        System.out.println(familyBudget.getMoney());

        FamilyMembers member1 = new FamilyMembers("Nika", "Gogua", 18, "Brother");
        FamilyMembers member2 = new FamilyMembers("Nia", "Gogua", 18, "Sister");
        FamilyMembers member3 = new FamilyMembers("Gia", "Gogua", 45, "Father");

        member1.setBudget(familyBudget);
        member2.setBudget(familyBudget);
        member3.setBudget(familyBudget);

        member1.setAmount(random.nextInt(5001));
        member2.setAmount(random.nextInt(5001));
        member3.setAmount(random.nextInt(5001));
        member1.start();
        member2.start();
        member3.start();
    }
}
