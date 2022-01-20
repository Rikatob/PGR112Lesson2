package org.pgr112.step4;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    private final String USERNAME = "Fredrik";
    private final String PASSWORD = "1234";

    public void runProgram(){
        System.out.println("Program starting");
        login();
//        task4();
        task6();
        task7Selection(task7());
    }

    private void task4(){
        ArrayList<String> input = new ArrayList<>();
        String[] question = {"Enter username:", "Enter Password:","Enter amount:"};
        Scanner myScan = new Scanner(System.in);
        for(int i = 0; i<3;i++){
            System.out.println(question[i]);
            input.add(myScan.nextLine());
        }
        for (String i : input){
            System.out.println(i);
        }
    }

    private void login(){
        ArrayList<String> userInputs= new ArrayList<>();
        String[] questions = {"Enter username:", "Enter Password:"};
        Scanner myScan = new Scanner(System.in);
        boolean login = false;
        while(!login){
            for(String question : questions){
                System.out.println(question);
                String input = myScan.nextLine();
                userInputs.add(input);
            }
            if(userInputs.get(0).equals(USERNAME) && userInputs.get(1).equals(PASSWORD)){
                login = true;
                System.out.println("Success");
            }else {
                userInputs.clear();
                System.out.println("Wrong login input");
            }
        }

    }

    private void task6(){
        Scanner scNmbr = new Scanner(System.in);
        int inputSum = 0;
        while(true){
            System.out.println("Enter a number, cancel with negative number: ");
            int scInput= Integer.parseInt(scNmbr.nextLine());
            if (scInput < 0){
                break;
            }
            inputSum += scInput;
        }
        System.out.println("Sum of your numbers: ");
        System.out.println(inputSum);
    }

    private int task7(){
        int selection;
        Scanner input = new Scanner(System.in);

        System.out.println("Choose one of the belows: ");
        System.out.println("1. Add a single word");
        System.out.println("2. Display all words");
        System.out.println("3. End");
        selection = input.nextInt();
        return selection;
    }
    private void task7Selection(int selection){
        ArrayList<String> words = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        while (selection != 3){
            switch (selection) {
                case 1:
                    System.out.println("Write a word: ");
                    words.add(input.nextLine());
                    break;
                case 2:
                    for (String i : words) {
                        System.out.print(i);
                    }
                    System.out.println();
                    break;

            }
            selection = task7();
        }
        System.out.println("Process ended!");
    }

}
