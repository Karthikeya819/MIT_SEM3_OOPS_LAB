/*
Define a class EMPLOYEE having following members: Ename, Eid, Basic, DA,
Gross_Sal, Net_Sal and following methods:
i) read(): to read N employee details
ii) display(): to display employee details
iii) compute_net_sal(): to compute net salary
*/

import java.io.*;
import java.util.*;

class EMPLOYEE{
	String Ename;
	int Eid,Basic;
	double DA,Gross_Sal,Net_Sal;

	void read(){
		Scanner input = new Scanner(System.in);
		System.out.println("--------Enter Employee Details--------");
		System.out.print("Enter Employee Name: ");
		this.Ename = input.nextLine();
		System.out.print("Enter Employee Id: ");
		this.Eid = input.nextInt();
		System.out.print("Enter Employee Basic Salary: ");
		this.Basic = input.nextInt();
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
		Scanner input = new Scanner(System.in);
		System.out.print("Enter No of Employee's : ");
		int N = input.nextInt();
		EMPLOYEE[] Empl_list = new EMPLOYEE[N];
		for(int i=0;i<N;i++){
			Empl_list[i] = new EMPLOYEE();
			Empl_list[i].read();
		}
		for(int i=0;i<N;i++){
			Empl_list[i].display();
		}
	}
}