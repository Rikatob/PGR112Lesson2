package org.pgr112.step5;

import java.io.File;
import java.io.IOException;


public class CreateFileExample {

    public static void createFile(String fileName){
        try{
            fileName = fileName +".txt";
            File myFile = new File(fileName);
            if(myFile.createNewFile()){
                System.out.println("New file created : "+ fileName);
            }else{
                System.out.println("File already exists.");
            }
        } catch (IOException ioe){
            System.out.println("Error has occurred, file cant be created!");
        }

        //FileReaderExample.readFile(fileName);

    }
}
