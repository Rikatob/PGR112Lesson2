package org.pgr112.step5;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class WriteToFileExample {

    public static void writeToFile(String fileName){
        fileName = fileName + ".txt";
        ArrayList<String> userInput = new ArrayList<>();
        Scanner p5scanner = new Scanner(System.in);
        boolean choice = false;
        int sentenceNumber = 1;

        while (!choice) {
            System.out.println("This is your " + sentenceNumber + ". sentence, write all to a file with /n");
            String input = p5scanner.nextLine();
            if (input == "") {
                System.out.println("Task complete!");
                choice = true;
            } else {
                userInput.add(input);
                sentenceNumber++;
            }
        }
        try {
            FileWriter writer = new FileWriter(fileName);
            for (String str : userInput) {
                writer.write(str + "\n");
            }
            writer.close();
        } catch (IOException ioe) {
            System.out.println("An error has occurred!");
        }
    }
}
