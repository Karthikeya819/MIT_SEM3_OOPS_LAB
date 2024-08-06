/*
Define a Class STUDENT having following Members: sname, marks_array, total, avg and
provide the following methods:
i) assign(): to assign initial values to the STUDENT object
ii) display(): to display the STUDENT object
iii) compute(): to Compute Total, Average marks
*/
import java.io.*;
import java.util.*;

class STUDENT{
	String sname;
	int marks_array[];
	int total;
	float avg;

	void assign(String sname,int marks_array[]){
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
		STUDENT student1 = new STUDENT();
		student1.assign(sname,marks_array);
		student1.compute();
		student1.display();
	}
}