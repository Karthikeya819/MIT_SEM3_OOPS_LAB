/*
Add member functions to the above code that perform the following operations
a) List all the students whose name starts with a particular character.
b) List all the student names containing a particular sub string.
c) Change the full name in the object to name with just initials and family name. For example, Prakash Kalingrao Aithal must be changed to P. K. Aithal and store it in the object. Display modified objects.
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
			if(this.Scgpa == this.Scgpa)return 0;
			if(this.Scgpa < this.Scgpa)return -1;
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
    // 5th Question
    static void listNameswithChar(student students[],int N,char Search){
        System.out.println("Students Names Starting with "+Search);
        for(int i= 0;i<N;i++){
            if(students[i].Sname.charAt(0) == Search){
                System.out.println(students[i].Sname);
            }
        }
    }
    static void listNameswithsubString(student students[],int N,String Search){
        System.out.println("Students Names with SubString "+Search);
        for(int i= 0;i<N;i++){
            if(students[i].Sname.contains(Search)){
                System.out.println(students[i].Sname);
            }
        }
    }
    void formatFullName(){
        String name = Sname;
        int Capnum = 0;
        while(name.indexOf(" ") > 0){
            int temp = name.indexOf(" ");
            name = name.substring(0,Capnum+1) + "."+name.substring(temp+1,name.length());
            Capnum+=2;
        }
        Sname = name;
    }

}

class q5{
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
        // 5th Question
        String buffer = input.nextLine();
        System.out.print("Enter Char to Search: ");
        char search = input.nextLine().charAt(0);
        student.listNameswithChar(students,N,search);
        System.out.print("Enter Strinng to Search: ");
        String search1 = input.nextLine();
        student.listNameswithsubString(students,N,search1);
        for(int i=0;i<N;i++){
            students[i].formatFullName();
        }
        for(int i=0;i<N;i++){
			students[i].display();
		}
        input.close();
	}
}