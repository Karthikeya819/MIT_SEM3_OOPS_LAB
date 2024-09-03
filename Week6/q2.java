/*
To the already defined EMPLOYEE class, add two subclasses FullTimeEmp and
PartTimeEmp. Add the following data Members and Member Functions to the
PartTimeEmp class. hoursWorked (int): Represents the number of hours worked by the
part-time employee. hourlyRate (double, static and final): Represents the hourly rate at
which the part-time employee is paid. The calculateSalary(): Overrides the
calculateSalary() method of the base class to calculate the salary of the part-time
employee based on the hours worked and hourly rate. The displayEmployeeDetails():
Overrides the displayEmployeeDetails() method of the base class to display the part-time
employee's details, including the hours worked and hourly rate.
The FullTimeEmployee subclass includes the data members bonus and deductions as
additional data members and are of type double, and overrides the calculateSalary() and
displayEmployeeDetails() methods to incorporate these factors. Define Main class to
check the functionality of all the classes.
*/

import java.io.*;
import java.util.*;

class EMPLOYEE{
	String Ename;
	int Eid,Basic;
	double DA,Gross_Sal,Net_Sal;

	EMPLOYEE(String Ename,int Eid,int Basic){
		this.Ename = Ename;
		this.Eid = Eid;
		this.Basic = Basic;
	}
	EMPLOYEE(String Ename,int Eid){
		this.Ename = Ename;
		this.Eid = Eid;
	}

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

class FullTimeEmp extends EMPLOYEE{
	double FEBonus,FEDeduction;
	FullTimeEmp(String Ename,int Eid,int Basic,double FEBonus,double FEDeduction){
		super(Ename,Eid,Basic);
		this.FEBonus = FEBonus;
		this.FEDeduction = FEDeduction;
	}
	void calculateSalary(){
		super.Gross_Sal = super.Basic+this.FEBonus-this.FEDeduction;
		super.Net_Sal = super.Gross_Sal*0.7;
	}
	void display(){
		System.out.println("----------Employee Details----------");
		System.out.println("Employee Name: "+super.Ename);
		System.out.println("Employee Id: "+super.Eid);
		System.out.println("Employee Basic Salary: "+super.Basic);
		System.out.println("Employee Bonus: "+this.FEBonus);
		System.out.println("Employee Deductions: "+this.FEDeduction);
		System.out.println("Employee Gross_Sal: "+super.Gross_Sal);
		System.out.println("Employee Net_Sal: "+super.Net_Sal);
	}


}
class PartTimeEmp extends EMPLOYEE{
	int hoursWorked;
	final static double hourlyRate = 20.0;
	PartTimeEmp(String Ename,int Eid,int hoursWorked){
		super(Ename,Eid);
		this.hoursWorked = hoursWorked;
	}
	void calculateSalary(){
		super.Basic = (int)Math.round(this.hoursWorked*this.hourlyRate);
		super.Gross_Sal = super.Basic;
		super.Net_Sal = super.Gross_Sal*0.7;
	}
	void display(){
		System.out.println("----------Employee Details----------");
		System.out.println("Employee Name: "+super.Ename);
		System.out.println("Employee Id: "+super.Eid);
		System.out.println("Employee Hours Worked: "+this.hoursWorked);
		System.out.println("Employee Hourly Rate: "+PartTimeEmp.hourlyRate);
		System.out.println("Employee Gross_Sal: "+super.Gross_Sal);
		System.out.println("Employee Net_Sal: "+super.Net_Sal);
	}

}

class q2{
	public static void main(String[] args){
		FullTimeEmp fte1 = new FullTimeEmp("Karthikeya",1,10000,2000,500);
		fte1.calculateSalary();
		fte1.display();
		PartTimeEmp pte1 = new PartTimeEmp("Aditya",2,20);
		pte1.calculateSalary();
		pte1.display();

	}
}