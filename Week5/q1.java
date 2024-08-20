/*
1. Add the following string processing methods to the class Employee:
a) formatEmployeeName(): A method that formats the employee's name by
capitalizing the first letter of each word and converting the remaining letters to
lowercase. For example, if the employee's name is "JOHN DOE", this method
would transform it to "John Doe".
b) generateEmail(): A method that generates an email address for the employee
based on their name. For example, if the employee's name is "John Doe", this
method would generate an email address like "jdoe@example.com".
*/

import java.io.*;
import java.util.*;

class Employee{
	String Ename;
	String Eemail;
	Employee(String Ename){
		this.Ename = Ename;
	}
	void formatEmployeeName(){
		if(Ename.length() > 0){
			Ename = Ename.toLowerCase();
			char name[] = Ename.toCharArray();
			name[0] = (""+name[0]).toUpperCase().charAt(0);
			name[Ename.indexOf(" ")+1] = (""+name[Ename.indexOf(" ")+1]).toUpperCase().charAt(0);
			Ename = new String(name);
			System.out.println(Ename);
		}
	}
	void generateEmail(){
		int temp = Ename.indexOf(" ");
		String name = Ename.toLowerCase();
		Eemail = name.charAt(0)+ name.substring(temp+1,Ename.length()) + "@example.com";
		System.out.println(Eemail);

	}
}

class q1{
	public static void main(String args[]){
		System.out.println("Hello World!");
		Employee e1 = new Employee("KarthIkeya davSam");
		e1.formatEmployeeName();
		e1.generateEmail();
	}
}