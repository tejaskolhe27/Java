package ASSIGNMENT.DAY11;
import java.io.*;

class Thre1 implements Runnable {

    char[] content = new char[1000];
    public char[] getContent() {
        return content;
    }

    public void run() {
        File file = new File("ASSIGNMENT/DAY11/src.txt");
        try {
            FileReader fileReader = new FileReader(file);
            fileReader.read(content);
            fileReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Thre2 implements Runnable {
    private char[] content;

    public Thre2(char[] content) {
        this.content = content;
    }

    public void run() {
        try {
            File file1 = new File("ASSIGNMENT/DAY11/dest.txt");
            FileWriter fileWriter = new FileWriter(file1);
            fileWriter.write(content);
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class java3 {
    public static void main(String[] args) {
        Thre1 t1 = new Thre1();
        Thread f1 = new Thread(t1);
        f1.start();
        try {
            f1.sleep(20);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Thre2 t2 = new Thre2(t1.getContent());
        Thread f2 = new Thread(t2);
        f2.start();
    }
}
