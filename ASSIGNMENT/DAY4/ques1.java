/*
 * 
  Write a class Student having following –
Student Roll Number (int)
Student Name (String)
Date of Birth (Date class object where Date is user defined class)
Implement default constructor, parameterized constructor, accept, display. Generate the student roll number automatically.

 */
package ASSIGNMENT.DAY4;

import java.util.Scanner;

class Student{
        private int rollno;
        private String name;
        private Date dob;
        private static int r=100;

        public Student(){
            rollno=0;
            name="abc";
            dob=new Date();
        }
        public Student(String name, int d,int m,int y) {
            r++;
            this.rollno = r;
            this.name = name;
            this.dob = new Date(d, m, y);

        } 
        public void show(){
            System.out.print("Roll no: "+rollno+"\n"+"Name: "+name+"\n");
            System.out.print("Date of Birth: ");
            dob.show();
        }
}
public class ques1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the student name: ");
        String name=sc.next();
        System.out.println("Enter the Day: ");
        int d=sc.nextInt();
        System.out.println("Enter the month: ");
        int m=sc.nextInt();
        System.out.println("Enter the year: ");
        int y=sc.nextInt();


        Student s1 = new Student(name, d,m,y);
        Student s2 = new Student("Tejas", 26, 02, 2002);
        s1.show();
        s2.show();
    }
}
