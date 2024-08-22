/*
Perform the following operations by adding member functions to the program implemented in the above question
a) Sort the student records with respect to semester and CGPA.
b) Sort the student record with respect to name.
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
	//4th Quuestion
	int sgcmpto(student st2){
		if(this.Ssem == st2.Ssem){
			if(this.Scgpa == st2.Scgpa)return 0;
			if(this.Scgpa < st2.Scgpa)return -1;
			return 1;
		}else{
			if(this.Ssem < st2.Ssem)return -1;
			return 1;
		}
	}
    int ncpmto(student st2){
        return this.Sname.compareTo(st2.Sname);
    }
    static void sortStudentsBySemGpa(student students[],int N){
        for(int i = 0;i<N;i++){
            for(int j = i+1;j<N;j++){
                if(students[i].sgcmpto(students[j]) > 0){
                    student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
        System.out.println("Sorted student records with respect to semester and CGP");
        for(int i =0;i<N;i++){            
            students[i].display();
        }
    }
    static void sortStudentsByName(student students[],int N){
        for(int i = 0;i<N;i++){
            for(int j = i+1;j<N;j++){
                if(students[i].ncpmto(students[j]) > 0){
                    student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
        System.out.println("Sorted student records with respect to name");
        for(int i =0;i<N;i++){
            students[i].display();
        }
    }

}

class q4{
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
        // 4th Question
        student.sortStudentsBySemGpa(students,N);
        student.sortStudentsByName(students,N);
        input.close();
	}
}