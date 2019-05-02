package java8NewFeatures;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>
{

	int rollNum;
	String name;
	int age;
	
	public Student(int rollNum, String name, int age){
		this.rollNum=rollNum;
		this.name=name;
		this.age=age;
		
	}
	
	@Override
	public int compareTo(Student st) {
		if(age==st.age)
		return 0;
		else if(age<st.age)
		return 1;
		else return -1;
	}
	
	
	
	
}



public class TestJava8ComparableSample {

	public static void main(String[] args) {
	ArrayList<Student> list=new ArrayList<Student>();
	list.add(new Student(104,"Rasheed",26));
	list.add(new Student(95,"ahmed",12));
	list.add(new Student(109,"Rashsheikeed",35));
	
	Collections.sort(list);
	
	for(Student s:list)
	{
System.out.println(s.rollNum+" "+s.age+" "+s.name);
	}
	}

}
