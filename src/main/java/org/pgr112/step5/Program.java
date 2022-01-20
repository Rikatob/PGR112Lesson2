package org.pgr112.step5;


import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    private final ArrayList<Artist> artistArray = new ArrayList<>();

    public void run(){
        int choice;
        do {
            choice = startMenu();
            switch (choice) {
                case 1:
                    problem4();
                    break;
                case 2:
                    problem5();
                    break;
                case 3:
                    endMenu();
                    break;
            }
        } while (choice != 3);

    }

    public int startMenu(){
        int selection;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Hello! choose one of the below:");
        System.out.println("1. Create a file");
        System.out.println("2. Write to a file");
        System.out.println("3. Open ending menu");
        selection = userInput.nextInt();
        return selection;
    }


    private void problem4()  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Create a new file!");
        System.out.println("Enter the name you want on the file");
        String input = sc.nextLine();
        CreateFileExample.createFile(input);
    }


    private void problem5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What file do you want to write to?");
        String input = sc.nextLine();
        WriteToFileExample.writeToFile(input);
    }

    public void problem7(){
        ArrayList<String> array = new ArrayList<>();

        try {
            File myFile = new File("oppg7.txt");
            Scanner sc = new Scanner(myFile);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            while(sc.hasNextLine()){
                String data = sc.nextLine();

                if (!data.equals("---")){
                    array.add(data);
                } else{
                    Artist artist = new Artist(array.get(0),LocalDate.parse(array.get(1),formatter),array.get(2),array.get(3));
                    artistArray.add(artist);
                    array.clear();
                }
            }
        } catch (FileNotFoundException fnfe){
            System.err.println("Error.File not found!");
        }
    }


    public void problem8(){
        for(Artist artist: artistArray){
            if(artist.getArtistName().equals("Prince")){
                artist.setArtistName("Tobias");
                }
        }
        //printArtistArray();
        writeArtistArray();
    }


    public void writeArtistArray() {

        for (Artist artist : artistArray){
            String outputText = artist.getArtistName() + "\n" + artist.getDateOfBirth() + "\n" + artist.getCity() + "\n" + artist.getCountry() + "\n" + "---";
            saveToFile("oppg8.txt",outputText,true);
        }
    }

    public void saveToFile(String filename, String text, boolean append){
        // Create a file
        File file1 = new File(filename);

        // create a file writer class
        FileWriter fw = null;
        try {
            fw = new FileWriter(file1,append);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // create a print writer class
        PrintWriter pw = new PrintWriter(fw);

        pw.println(text);
        pw.close();

    }
    public void printArtistArray(){
        for(Artist artist : artistArray){
            artist.printFieldValues();
            System.out.println("=========================");
            System.out.println();
        }
    }
    private void endMenu(){
            Scanner userInputSc = new Scanner(System.in);
            System.out.println("1. Open file");
            System.out.println("2. exit program");
//            int selection = userInputSc.nextInt();
            int selection = Integer.parseInt(userInputSc.nextLine());
//            int selection = 1;
            if(selection == 1){
                System.out.println("Write the name of the file: ");
                String input = userInputSc.nextLine();
                FileReaderExample.readFile(input);
            }else{
                System.err.println("Program terminated!");
            }
    }




}
