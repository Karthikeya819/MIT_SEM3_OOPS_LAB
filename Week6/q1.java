/*
To the already defined STUDENT class, add two subclasses ScienceStudent and 
ArtsStudent. Add a private data member practicalMarks (int): to the ScienceStudent 
class to represent the marks obtained by the student in the practical subject. The 
ScienceStudent class should override the compute() method to include the practical 
marks in the total marks and average marks calculation. The ScienceStudent class 
should provide a method displayPracticalMarks() to display the practical marks 
obtained by the science student. Add the private data member electiveSubject 
(String): to the ArtsStudent class to represent the elective subject chosen by the arts 
student. Also add appropriate constructors to the subclasses. In the Main class, create 
objects of STUDENT, ScienceStudent, and ArtsStudent, and demonstrate the
keyword ‘super’ and other functionalities of the classes by assigning values, 
computing marks, and displaying the information of the students. Also demonstrate 
dynamic polymorphism.
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
class ScienceStudent extends STUDENT{
    private int practicalMarks;
    ScienceStudent(String sname,int marks_array[],int practicalMarks){
        super.assign(sname,marks_array);
        this.practicalMarks = practicalMarks;
    }
    void compute(){
		super.total = 0;
		for(int i=0;i<3;i++){
			super.total += super.marks_array[i];
		}
        this.total += this.practicalMarks;
		super.avg = (super.total)/4;
	}
    void displayPracticalMarks(){
        System.out.println("Practical Marks of Student(Science) is "+this.practicalMarks);
    }

}
class ArtsStudent extends STUDENT{
    private String electiveSubject;
    ArtsStudent(String sname,int marks_array[],String electiveSubject){
        super.assign(sname,marks_array);
        this.electiveSubject = electiveSubject;
    }
    void displayelectiveSubject(){
        System.out.println("Elective Subject Choosen by Student is "+this.electiveSubject);
    }

}
class q1{
    public static void main(String[] args){
        int Arr[] = {80,80,80};
        ScienceStudent ss1 = new ScienceStudent("Karthikeya",Arr,80);
        ss1.compute();
        ss1.display();
        ss1.displayPracticalMarks();
        int Arr1[] = {60,80,90};
        ArtsStudent as1 = new ArtsStudent("Aditya",Arr1,"Data Science");
        as1.compute();
        as1.display();
        as1.displayelectiveSubject();
    }
}