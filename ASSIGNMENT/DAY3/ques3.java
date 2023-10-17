/*
 * Implement getter/setter methods and method “toString” in above class Student.
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
public class ques3 {
    public static void main(String[] args) {
      Student s = new Student("Atharva", 80); 
      Student s1 = new Student("Tejas", 80); 
      Student s2 = new Student("Vishal", 88.3); 
      System.out.println(s); 
      System.out.println(s1);
      System.out.println(s2);


      // Implementing getter setter
      System.out.println(s.getName());
      System.out.println(s1.getPercentage());
      s2.setName("Vishal J");
      System.out.println(s2);
      s1.setPercentage(99);
      System.out.println(s1);
    }
}