package ASSIGNMENT.DAY3.ques4.com.cdac;
import ASSIGNMENT.DAY3.ques4.com.cdac.Batch;
import ASSIGNMENT.DAY3.ques4.com.cdac.Student;

public class Default {
    public static void main(String[] args) {
        Student s1 = new Student(1,"atharva");
        Batch b1 = new Batch("DAI", 39);
        System.out.println(s1+" "+b1);

        Student s2 = new Student(2,"tejas");
        Batch b2 = new Batch("DAI", 39);
        System.out.println(s2+" "+b2);

        Student s3 = new Student(3,"vishal");
        Batch b3 = new Batch("DAI", 39);
        System.out.println(s3+" "+b3);   
    }  
}
