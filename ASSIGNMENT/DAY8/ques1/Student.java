package ASSIGNMENT.DAY8.ques1;


import java.util.HashSet;
import java.util.Set;

public class Student {
	private int rollno;
	private String name;
	private double percentage;
	private Set<String> skillset;
	public Student(int rollno, String name, double percentage, Set<String> skillset) {
		
		this.rollno = rollno;
		this.name = name;
		this.percentage = percentage;
		this.skillset = skillset;
	}
	public Student() {
		super();
		this.rollno = 1;
		this.name = "";
		this.percentage = 0.0;
		this.skillset = new HashSet<String>();
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
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
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public Set<String> getSkillset() {
		return skillset;
	}
	public void setSkillset(Set<String> skillset) {
		this.skillset =new HashSet<String>(); 
		this.skillset=skillset;
	}
	public void disp()
	{
		System.out.println("Roll No: "+rollno+" Name: "+name+" Percentage: "+percentage);
		System.out.println("Skill Set: "+skillset);
	}
}