/*
Person class with private instance variables for the person’s name and birth date. Add
appropriate accessor methods for these variables. Then create a subclass College
Graduate with private instance variables for the student’s GPA and year of
graduation and appropriate accessors for these variables. Include appropriate
constructors for your classes. Then create a class with main() method that
demonstrates your classes.
*/

import java.io.*;
import java.util.*;

class Person{
	private String Pname;
	private int Pday,Pmonth,Pyear;
	Person(String Pname,int Pday,int Pmonth,int Pyear){
		this.Pname = Pname;
		this.Pday = Pday;
		this.Pmonth = Pmonth;
		this.Pyear = Pyear;
	}
	String getName(){
		return Pname;
	}
	void displayDob(){
		System.out.println(Pday+"/"+Pmonth+"/"+Pyear);
	}
}
class CollegeGraduate extends Person{
	private double Cgpa;
	private int GradYear;
	CollegeGraduate(String Pname,int Pday,int Pmonth,int Pyear,double Cgpa,int GradYear){
		super(Pname,Pday,Pmonth,Pyear);
		this.Cgpa = Cgpa;
		this.GradYear = GradYear;
	}
	int getGradYear(){
		return GradYear;
	}
	double getCgpa(){
		return Cgpa;
	}
}


class q3{
	public static void main(String args[]){
		CollegeGraduate cg1 = new CollegeGraduate("Karthikeya",20,9,2005,9.2,2027);
		System.out.println("Student Name:"+cg1.getName());
		cg1.displayDob();
		System.out.println("Student Cgpa:"+cg1.getCgpa());
		System.out.println("Student Graduation Year:"+cg1.getGradYear());
	}
}