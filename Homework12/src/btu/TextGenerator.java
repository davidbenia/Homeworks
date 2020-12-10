package btu;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TextGenerator implements TG_Interface{
    String input_language, parameters;
    ArrayList<String> alphabet = new ArrayList<>();

    public TextGenerator() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Language(en; ge; ru):");
        input_language = scanner.nextLine();

        System.out.print("\n");

        System.out.println("Input Parameters(S-x1{1}-y1{1}-W-x2{1}-y2{1}-L-x3{1}-y3{1}):");
        parameters = scanner.nextLine();

        System.out.print("\n");

        GenerateAlphabet(input_language);
    }

    @Override
    public void GenerateAlphabet(String input_language) {
        if(input_language.equals("en")){
            for(char c = 97; c <= 122; c++){
                alphabet.add(Character.toString(c));
            }
        }
        else if(input_language.equals("ge")){
            for(char c = 4304; c <= 4336; c++){
                alphabet.add(Character.toString(c));
            }
        }
        else if(input_language.equals("ru")){
            for(char c = 1072; c <= 1103; c++){
                alphabet.add(Character.toString(c));
            }
        }
        else {
            System.out.println("Wrong language, defaulting to 'en'.\n");
            GenerateAlphabet("en");
        }
    }

    @Override
    public String GenerateText() {
        Random rand = new Random();
        String text = "";
        int sentence_amt, word_amt, word_length;

        //S-x1-y1-W-x2-y2-L-x3-y3
        if(!parameters.matches("^S-\\d{1}-\\d{1}-W-\\d{1}-\\d{1}-L-\\d{1}-\\d{1}")) {
            System.out.println("Wrong parameter format, defaulting to 'S-1-3-W-3-5-L-3-6'\n");
            parameters = "S-1-3-W-3-5-L-3-6";
        }

        sentence_amt = rand.nextInt(Character.getNumericValue(parameters.charAt(4)) - Character.getNumericValue(parameters.charAt(2)) + 1) + Character.getNumericValue(parameters.charAt(2));
        word_amt = rand.nextInt(Character.getNumericValue(parameters.charAt(10)) - Character.getNumericValue(parameters.charAt(8)) + 1) + Character.getNumericValue(parameters.charAt(8));
        word_length = rand.nextInt(Character.getNumericValue(parameters.charAt(16)) - Character.getNumericValue(parameters.charAt(14)) + 1) + Character.getNumericValue(parameters.charAt(14));

        for(int i = 1; i <= sentence_amt; i++){
            String sentence = "";
            for(int j = 1; j <= word_amt; j++){
                String word = "";
                for(int k = 1; k <= word_length; k++){
                    word += alphabet.get(rand.nextInt(alphabet.size() - 1));
                }
                sentence += word + " ";
            }
            text += sentence + "    ";
        }

        return text;
    }
}
