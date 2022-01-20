package org.pgr112.step5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderExample {

    public static void readFile(String fileName){
    try{
        fileName = fileName +".txt";
        File myFile = new File(fileName);
        Scanner myReader = new Scanner(myFile);
        System.out.println("============" + fileName + " contains:============");
        while (myReader.hasNextLine()){
            String data = myReader.nextLine();
            System.out.println(data);
        }
        System.err.println("============Program terminated!============");
    } catch(FileNotFoundException fnfe){
        System.out.println("Error, File not found");
        }
    }

}
