/*
* 2
 * Write a class Student with members for rollno, name and percentage. 
 * Implement necessary methods inside class. Generate roll number automatically for objects created. Use static and take starting value as 101..
 */
package ASSIGNMENT.DAY3;

class Student{
    private int rollno;
    private String name;
    private double percentage;
    private static int r=100;
    
    public Student(String name, double percentage) {
        r++;
        this.rollno=r;
        this.name = name;
        this.percentage = percentage;
    }
    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getPercentage() {
        return percentage;
    }
    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Student [rollno=" + rollno + ", name=" + name + ", percentage=" + percentage + "]";
    }
}
public class ques2 {
    public static void main(String[] args) {
      Student s = new Student("Atharva", 80); 
      Student s1 = new Student("Tejas", 80); 
      Student s2 = new Student("Vishal", 88.3); 
      System.out.println(s); 
      System.out.println(s1);
      System.out.println(s2);
    }
}