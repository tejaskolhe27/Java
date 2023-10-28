package Files_hand;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class handling {
    public static void main(String[] args) {
        File file = new File("Files_hand/demo.txt");
        File file1 = new File("Files_hand/demo1.txt");

System.out.println(" ================================================ Writng  the Text File (File Writer) ======================================================");

System.out.println();
        try {
            file.createNewFile();
        } catch (IOException e) {
         
            e.printStackTrace();
        }
        System.out.println("File Created......");

        try{

            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(("This is first line in the file"));
            fileWriter.close();
        }
        catch(Exception e){ }
System.out.println();

System.out.println(" ================================================ Reading the Text File (File Reader) ======================================================");
System.out.println();
System.out.println();
        try {
            char [] s = new char[1000];
            FileReader fileReader = new FileReader(file1);
            fileReader.read(s);
            System.out.println(s);
        } catch (Exception e) {
        }


System.out.println("================================================= Reading the Text File (Scanner class) ====================================================");
System.out.println();
System.out.println();
        try {
            Scanner sc = new Scanner(file1);
            while (sc.hasNextLine()) {
                String str = sc.nextLine();
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }




    }
    
}
