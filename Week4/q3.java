/*
Define a class to represent a Bank account. Include the following members.
Data members:
1. Name of the depositor
2. Account number.
3. Type of account.
4. Balance amount in the account.
5. Rate of interest (static data)
Provide a default constructor and parameterized constructor to this class. Also
provide Methods:
1. To deposit amount.
2. To withdraw amount after checking for minimum balance.
3. To display all the details of an account holder.
4. Display rate of interest (a static method)
Illustrate all the constructors as well as all the methods by defining objects.
*/

import java.io.*;
import java.util.*;

class BANKACCOUNT{
	String Bname;
	int Baccnumber;
	String Btype;
	int Bbalance;
	static int Broi = 5;
	static int Bminbal = 200;
	BANKACCOUNT(){
		Bname = "Not Assigned";
		Baccnumber = 0;
		Btype = "Not Mentioned";
		Bbalance = 0;
	}
	BANKACCOUNT(String Bname,int Baccnumber,String Btype,int Bbalance){
		this.Bname = Bname;
		this.Baccnumber = Baccnumber;
		this.Btype = Btype;
		this.Bbalance = Bbalance;
	}
	void depositAmount(int Amount){
		Bbalance += Amount;
		System.out.println("₹"+Bbalance+" Deposited to "+Baccnumber);
	}
	void withdrawAmount(int Amount){
		if(Bbalance - Amount <= Bminbal){
			System.out.println("Balance Insufficient");
			return;
		}
		Bbalance -= Amount;
		System.out.println("₹"+Amount+" Withdrawed from "+Baccnumber);
	}
	void displayAcc(){
		System.out.println("-------Bank Account Details-------");
		System.out.println("Bank Holder Name: "+Bname);
		System.out.println("Bank Account Number: "+Baccnumber);
		System.out.println("Bank Account Type: "+Btype);
		System.out.println("Bank Account Balance: "+Bbalance);
		System.out.println("-----------------------------------");
	}
	static void displayRoi(){
		System.out.println("Bank Rate of Intrest: "+Broi+"%");
	}
}

class q3{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Bank Holder Name: ");
		String Bname = input.nextLine();
		System.out.print("Enter Bank Account Number: ");
		int Baccnumber = input.nextInt();
		System.out.print("Enter Bank Account Type: ");
		String buff = input.nextLine();
		String Btype = input.nextLine();

		BANKACCOUNT cus1 = new BANKACCOUNT(Bname,Baccnumber,Btype,0);
		cus1.displayAcc();

		BANKACCOUNT cus2 = new BANKACCOUNT();
		cus2.displayAcc();

		System.out.print("Enter Amount to Deposit: ");
		int Amount = input.nextInt();
		cus1.depositAmount(Amount);

		System.out.print("Enter Amount to Withdraw: ");
		Amount = input.nextInt();
		cus1.withdrawAmount(Amount);

		BANKACCOUNT.displayRoi();
	}
}