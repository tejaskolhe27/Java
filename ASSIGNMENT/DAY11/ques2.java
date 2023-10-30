package ASSIGNMENT.DAY11;
import java.io.*;

class Handling_thread implements Runnable {

    private File sourceFile;
    private File destFile;
    

    public Handling_thread(File sourceFile, File destFile) {
        this.sourceFile = sourceFile;
        this.destFile = destFile;
    }

    @Override
    public void run() {
        try {
            char [] s = new char[1000];
            FileReader fileReader = new FileReader(sourceFile);
            fileReader.read(s);

            FileWriter fileWriter = new FileWriter(destFile);
            fileWriter.write(s);
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

public class ques2 {
    public static void main(String[] args) {
        File sourceFile = new File("ASSIGNMENT/DAY11/src.txt");
        File destFile = new File("ASSIGNMENT/DAY11/dest.txt");

        Thread thread = new Thread(new Handling_thread(sourceFile, destFile));
        thread.start();
    }
    
}
