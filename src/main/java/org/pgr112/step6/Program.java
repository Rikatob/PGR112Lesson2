package org.pgr112.step6;

import java.io.*;
import java.util.*;

public class Program {
    ArrayList<String> fileContent = new ArrayList<>();
    ArrayList<String> generatedStory = new ArrayList<>();
    int adjectiveCounter = -1;

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_CYAN ="\u001B[92m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public void run(){
        int choice;
        do{
            choice = startMenu();
            switch (choice){
                case 1:
                    generateStory("adjektiv");
                    break;
                case 2:
                    generateStory(adjektivInput());
                    break;
                case 3:
                    endMenu();
                    break;
            }
        } while(choice !=3);
    }

    /**
     *
     * @return an int that represent the operation the user wants to execute
     */
    public int startMenu(){
        int selection;
        Scanner mysc = new Scanner(System.in);

        System.out.println(ANSI_CYAN + "\n[===============]");
        System.out.println("|  Start menu!  |" );
        System.out.println("[===============]" + ANSI_RESET);
        System.out.println("Here you have the chance to make a funny story, choose from the options below: ");
        System.out.println("1. Create adjective history automatically. ");
        System.out.println("2. Create adjective history with your own adjectives. ");
        System.out.println("3. Go to ending menu. ");

        selection=mysc.nextInt();
        return selection;

    }

    /**
     * Generate a story based on story.txt and a chosen file with adjectives.
     * @param fileName is the name of the file that the user wants to get adjectives from.
     */
    public void generateStory(String fileName){
        ArrayList<String> story = new ArrayList<>();
        story = readFile("story");

        for(int i = 0; i< story.size();i++){
            String s = story.get(i);
            String[] a = s.split("\\s");
            for(int j = 0; j<a.length;j++){
                if(a[j].equals("__")){
                    a[j] = randomAdjektiv(fileName);
                }
            }
            s = String.join(" ",a);
            story.set(i,s);
        }

        System.out.println(ANSI_CYAN + "\n[========================]");
        System.out.println("|  Here are your story:  |");
        System.out.println("[========================]"+ ANSI_RESET);
        generatedStory = story;
        for(String str: story){
            System.out.println(str);
        }
        writeStory();

    }

    public void writeStory(){
        adjectiveCounter = -1;
        Scanner mysc = new Scanner(System.in);
        System.out.println(ANSI_CYAN +"\n[===========================================]");
        System.out.println("|  Do you want to save the story to a file  |");
        System.out.println("|                   Y/N?                    |");
        System.out.println("[===========================================]");
        if(mysc.nextLine().equalsIgnoreCase("y")){
            System.out.println("\n[===================]");
            System.out.println("|  Name your file:  |");
            System.out.println("[===================]"+ ANSI_RESET);
            String fileName = mysc.nextLine();
            try{
                FileWriter writer = new FileWriter(fileName + ".txt");
                for(String str : generatedStory){
                    writer.write(str + "\n");
                }
                writer.close();
            } catch (IOException ioe){
                System.err.println("An error has occurred!");
            }
            System.out.println(ANSI_CYAN + "\n[=========================================================]");
            System.out.println("|  File " + fileName + ".txt is now created                         |");
            System.out.println("|  and will be available after the program is terminated  |");
            System.out.println("[=========================================================]");
        }
        else{
            System.out.println("\n[===================]");
            System.out.println("|  File not saved!  |");
            System.out.println("[===================]" + ANSI_RESET);
        }
    }

    public String randomAdjektiv(String fileName){
        ArrayList<String> adjektiv = new ArrayList<>();
        adjektiv = readFile(fileName);
        if(adjectiveCounter == -1){
            Collections.shuffle(adjektiv);
        }
        adjectiveCounter++;
        return adjektiv.get(adjectiveCounter);
    }

    public String adjektivInput(){
        ArrayList<String> adjektiv = new ArrayList<>();
        Scanner mysc = new Scanner(System.in);
        int adjektivNmbr = 0;
        String fileName = "adjektivInput";
        for (int i = 0; i<23; i++){
            System.out.println("Enter a adjective, you have entered [" + adjektivNmbr+"/23]");
            adjektiv.add(mysc.nextLine());
            adjektivNmbr++;
        }
        try{
            FileWriter writer = new FileWriter(fileName + ".txt");
            for(String str : adjektiv){
                writer.write(str +"\n");
            }
            writer.close();
        } catch (IOException ioe){
            System.err.println("Error has occurred");
        }
        return fileName;
    }

    public ArrayList<String> readFile(String fileName){
        ArrayList<String> temp = new ArrayList<>();
        File myFile = new File(fileName+".txt");

        try{
            Scanner mysc = new Scanner(myFile);
            while (mysc.hasNextLine()){
                temp.add(mysc.nextLine());
            }
        } catch (FileNotFoundException fnfe){
            System.err.println("Error, File not found");
        }
        return temp;
    }

    public void endMenu(){
        Scanner mysc = new Scanner(System.in);
        System.out.println("1. Print file");
        System.out.println("2. Terminate program");
        int selector = mysc.nextInt();            //nextInt take the int from the block, but not the empty block itself.
        mysc.nextLine();                          // to not get error on next nextLine i use this nextLine to take the empty block.

        if(selector == 1 ){
            System.out.println(ANSI_CYAN +"[===============================]");
            System.out.println("|  Write the name on the file:  |");
            System.out.println("[===============================]" + ANSI_RESET);
            String input = mysc.nextLine();
            ArrayList<String> myFile =readFile(input);
            for(String str : myFile){
                System.out.println(str);
            }
            System.err.println("===Program terminated!===");
        } else{
            System.err.println("===Program terminated!===");
        }
    }
}
