/*
Design a class which represents a student. Every student record is made up of the
following fields.
a. Registration number (int)
b. Full Name (String)
c. Date of joining (Gregorian calendar)
d. Semester (short)
e. GPA (float)
f.CGPA (float)
Whenever a student joins he will be given a new registration number. Registration
number is calculated as follows. If year of joining is 2012 and he is the 80th student
to join then his registration number will be 1280.
Write member functions to do the following.
a) Provide parameterized constructors to this class
b) Write display method which displays the record. Test the class by writing
suitable main method.
c) Create an array of student record to store minimum of 5 records in it. Input the
records and display them.
*/

import java.io.*;
import java.util.*;

class student{
	static int Scount = 0;
	int Sregno;
	String Sname;
	GregorianCalendar Sdoj;
	short Ssem;
	float Sgpa;
	float Scgpa;

	student(String Sname,GregorianCalendar Sdoj,short Ssem,float Sgpa,float Scgpa){
		this.Sname = Sname;
		this.Sdoj = Sdoj;
		this.Ssem = Ssem;
		this.Sgpa = Sgpa;
		this.Scgpa = Scgpa;
		Scount += 1;
		this.Sregno = (this.Sdoj.get(Calendar.YEAR)%100)*100+Scount;
	}
	void display(){
		System.out.println("----------Student Details----------");
		System.out.println("Student Reg No:"+Sregno);
		System.out.println("Student Name:"+Sname);
		//System.out.println("Student DOJ:"+Sdoj.get(Calendar.DAY)+"/"+Sdoj.get(Calendar.MONTH)+"/"+Sdoj.get(Calendar.YEAR));
		System.out.println("Student DOJ:"+Sdoj.getTime());
		System.out.println("Student Sem:"+Ssem);
		System.out.println("Student GPA:"+Sgpa);
		System.out.println("Student CGPA:"+Scgpa);
	}

}

class q3{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter No of Students:");
		int N = input.nextInt();
		student students[] = new student[N];
		for(int i=0;i<N;i++){
			String buffer = input.nextLine();
			System.out.print("Enter Student Name:");
			String name = input.nextLine();
			System.out.print("Enter DOJ Day:");
			int day = input.nextInt();
			System.out.print("Enter DOJ Month:");
			int month = input.nextInt();
			System.out.print("Enter DOJ Year:");
			int year = input.nextInt();
			System.out.print("Enter Sem:");
			short sem = input.nextShort();
			System.out.print("Enter Gpa:");
			float gpa = input.nextFloat();
			System.out.print("Enter Cgpa:");
			float cgpa = input.nextFloat();

			students[i] = new student(name,new GregorianCalendar(year,month,day),sem,gpa,cgpa);
		}
		for(int i=0;i<N;i++){
			students[i].display();
		}
	}
}