package ASSIGNMENT.DAY11;

import java.io.*;
import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        File file = new File("ASSIGNMENT/DAY11/src.txt");
        File file1 = new File("ASSIGNMENT/DAY11/dest.txt");
        try {
            file1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            char [] s = new char[1000];
            FileReader fileReader = new FileReader(file);
            fileReader.read(s);
            FileWriter fileWriter = new FileWriter(file1);
            fileWriter.write(s);
            fileWriter.close();
            
        } catch (Exception e) {
        }

    
}
}
