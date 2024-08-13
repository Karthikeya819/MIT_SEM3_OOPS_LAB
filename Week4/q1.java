/*
Consider the already defined STUDENT class. Provide a default constructor and
parameterized constructor to this class. Also provide a display method. Illustrate all
the constructors as well as the display method by defining STUDENT objects.
*/

import java.io.*;
import java.util.*;

class STUDENT{
	String sname;
	int marks_array[];
	int total;
	float avg;

	STUDENT(){
		this.sname = "Not Assigned";
		this.marks_array = new int[3];
	}

	STUDENT(String sname,int marks_array[]){
		this.sname = sname;
		this.marks_array = marks_array;
	}
	void display(){
		System.out.println("---------Student Information------------");
		System.out.println("Student Name : " + this.sname);
		System.out.println("Student Marks:");
		for(int i = 0;i<3;i++){
			System.out.println("		"+"Subject "+(i+1)+" :"+this.marks_array[i]);
		}
		System.out.println("Student Total Marks : " + this.total);
		System.out.println("Student Avg : " + this.avg);
	}
	void compute(){
		this.total = 0;
		for(int i=0;i<3;i++){
			this.total += this.marks_array[i];
		}
		this.avg = (this.total)/3;
	}
}

class q1{
	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int marks_array[] = new int[3];
		System.out.print("Enter Student Name: ");
		String sname = input.nextLine();
		for(int i = 0;i<3;i++){
			System.out.print("Enter Subject "+(i+1)+" Marks:-");
			marks_array[i] = input.nextInt();
		}
		STUDENT student1 = new STUDENT(sname,marks_array);
		student1.compute();
		student1.display();
		STUDENT student2 = new STUDENT();
		student2.compute();
		student2.display();
	}
}