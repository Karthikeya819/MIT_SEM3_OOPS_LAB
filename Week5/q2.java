/*
Add the following string processing methods to the lass STUDENT:
a) extractInitials(): A method that extracts the initials from the student's name. For
example, if the student's name is "John Doe", this method would return "JD".
b) removeWhitespace(): A method that removes any whitespace characters from the
student's name. For example, if the student's name is "John Doe", this method
would transform it to "JohnDoe".
c) List all the student names containing a particular sub string.
d) Sort the students alphabetically
*/

import java.io.*;
import java.util.*;

class STUDENT{
	String Sname;
	String Initial;
	STUDENT(String Sname){
		this.Sname = Sname;
	}
	void extractInitials(){
		Initial = ""+Sname.charAt(0);
		Initial += Sname.charAt(Sname.indexOf(" ")+1);
		Initial = Initial.toUpperCase();
		System.out.println(Initial);
	}
	void removeWhitespace(){
		int temp = Sname.indexOf(" ");
		String name = Sname.substring(0,temp)+ Sname.substring(temp+1,Sname.length());
		System.out.println(name);
	}
	static void SearchSubString(STUDENT stu[],String substring){
		for(STUDENT s1:stu){
			if(s1.Sname.contains(substring) == true)System.out.println(s1.Sname);
		}
	}
	static void sortStudents(STUDENT stu[],int N){
		for(int i=0;i<N;i++){
			for(int j=i+1;j<N;j++){
				if(stu[i].Sname.compareTo(stu[j].Sname) > 0){
					STUDENT temp = stu[j];
					stu[j] = stu[i];
					stu[i] = temp;
				}
			}
		}
		System.out.println("Sorted Sudent Names:");
		for(int i=0;i<N;i++){
			System.out.println(stu[i].Sname);
		}

	}
}

class q2{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter No of Students:");
		int N = input.nextInt();
		STUDENT students[] = new STUDENT[N];
		String buffer = input.nextLine();
		for(int i=0;i<N;i++){
			System.out.print("Enter Student Name:");
			String name = input.nextLine();
			students[i] = new STUDENT(name);
		}
		for(int i=0;i<N;i++){
			students[i].extractInitials();
			students[i].removeWhitespace();
		}
		STUDENT.SearchSubString(students,"DOE");
		STUDENT.sortStudents(students,2);
	}
}