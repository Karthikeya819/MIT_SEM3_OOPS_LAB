/*
Consider the already defined EMPLOYEE class. Provide a default constructor, and
parameterized constructor. Also provide a display method. Illustrate all the
constructors as well as the display method by defining EMPLOYEE objects.
*/

import java.io.*;
import java.util.*;

class EMPLOYEE{
	String Ename;
	int Eid,Basic;
	double DA,Gross_Sal,Net_Sal;

	EMPLOYEE(){
		this.Ename = "Not Assigned";
		this.Eid = 0;
		this.Basic = 0;
		this.compute_net_sal();
	}
	EMPLOYEE(String Ename,int Eid,int Basic){
		this.Ename = Ename;
		this.Eid = Eid;
		this.Basic = Basic;
		this.compute_net_sal();
	}
	void display(){
		System.out.println("----------Employee Details----------");
		System.out.println("Employee Name: "+this.Ename);
		System.out.println("Employee Id: "+this.Eid);
		System.out.println("Employee Basic Salary: "+this.Basic);
		System.out.println("Employee DA: "+this.DA);
		System.out.println("Employee Gross_Sal: "+this.Gross_Sal);
		System.out.println("Employee Net_Sal: "+this.Net_Sal);
	}
	void compute_net_sal(){
		this.DA = 0.52*this.Basic;
		this.Gross_Sal = this.Basic + this.DA;
		this.Net_Sal = this.Gross_Sal*0.7;
	}

}

class q2{
	public static void main(String args[]){
		/*Scanner input = new Scanner(System.in);
		System.out.print("Enter No of Employee's : ");
		int N = input.nextInt();
		EMPLOYEE[] Empl_list = new EMPLOYEE[N];
		for(int i=0;i<N;i++){
			Empl_list[i] = new EMPLOYEE();
			Empl_list[i].read();
		}
		for(int i=0;i<N;i++){
			Empl_list[i].display();
		}*/

		Scanner input = new Scanner(System.in);
		System.out.println("--------Enter Employee Details--------");
		System.out.print("Enter Employee Name: ");
		String Ename = input.nextLine();
		System.out.print("Enter Employee Id: ");
		int Eid = input.nextInt();
		System.out.print("Enter Employee Basic Salary: ");
		int Basic = input.nextInt();

		EMPLOYEE emp1 = new EMPLOYEE(Ename,Eid,Basic);
		emp1.display();

		EMPLOYEE emp2 = new EMPLOYEE();
		emp2.display();

	}
}