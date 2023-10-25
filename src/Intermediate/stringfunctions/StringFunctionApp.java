package Intermediate.stringfunctions;

import java.util.Scanner;

public class StringFunctionApp {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        String inputText = keyboardInput.nextLine();

        if(inputText.equals("paris")){
            System.out.println("Paris was typed in");
        }else{
            System.out.println("The text typed in was: " + inputText);
        }

        if(inputText.equalsIgnoreCase("paris")){
            System.out.println("Paris was typed in");
        }else{
            System.out.println("The text typed in was: " + inputText);
        }

        if(inputText.contains("par")){
            System.out.println("The text contains par");
        }

        if(inputText.isEmpty()){
            System.out.println("The input text is empty");
        }
        System.out.println("The length of input is: " + inputText.length());
        System.out.println("The input text with uppercase: " + inputText.toUpperCase());
        System.out.println("The input text with lowercase: " + inputText.toLowerCase());

        if (inputText.startsWith("P") || inputText.endsWith("P")) {
            System.out.println("The input text starts or ends with a P letter.");
        }

        System.out.println("The replaced text: " + inputText.replace("N", "D"));
    }
}
