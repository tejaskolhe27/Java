package ASSIGNMENT.DAY8.ques1;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class UtilityList {
	private List<Student> studlist;
	Scanner sc = new Scanner(System.in);
	public List<Student> getStudList()
	{
		return studlist;
	}
	public void createList()
	{
		studlist=new LinkedList<Student>();
		System.out.println("Enter No of Students: ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			Student s=new Student();
			System.out.println("Enter Roll No of Student: ");
			s.setRollno(sc.nextInt());
			System.out.println("Enter Name of Student: ");
			s.setName(sc.next());
			System.out.println("Enter Percentage of Student: ");
			s.setPercentage(sc.nextDouble());
			
			String ch;
			Set<String> ss=new HashSet<String>();
			do
			{		
				System.out.println("Enter Skill of Student: ");
				String skill=sc.next();
				ss.add(skill);
				System.out.println("Add more skill's?(y/n): ");
				ch=sc.next();				
			}while(ch.equals("y"));
			s.setSkillset(ss);
			studlist.add(s);
		}
		
	}
	public void printList()
	{
		System.out.println("Student Name-->Percentage");
		for(Student stud:studlist)
		{
			stud.disp();
		}
	}
}