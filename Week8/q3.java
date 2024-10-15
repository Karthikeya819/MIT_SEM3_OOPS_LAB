/*
Design a Student class with appropriate data members as in Lab 5. Provide your own
exceptions namely Seats Filled Exception, which is thrown when Student registration
number is >XX25 (where XX is last two digits of the year of joining) Show the usage
of this exception handling using Student objects in the main. (Note: Registration
number must be a unique number)
*/
import java.util.*;

class SeatsFilledException extends Exception{
	String tostring(){return "Seats are Filled!";}
}

class student{
	static int Scount = 0;
	int Sregno;
	String Sname;
	GregorianCalendar Sdoj;
	short Ssem;
	float Sgpa;
	float Scgpa;

	student(String Sname,GregorianCalendar Sdoj,short Ssem,float Sgpa,float Scgpa) throws SeatsFilledException{
		this.Sname = Sname;
		this.Sdoj = Sdoj;
		this.Ssem = Ssem;
		this.Sgpa = Sgpa;
		this.Scgpa = Scgpa;
		if(Scount >= 2)throw new SeatsFilledException();
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
}

class q3{
	public static void main(String args[]){
		try{
			student s1 = new student("Karthikeya",new GregorianCalendar(2005,9,20),(short)3,(float)2.3,(float)4.6);
			student s2 = new student("Karthikeya",new GregorianCalendar(2005,9,20),(short)3,(float)2.3,(float)4.6);
			student s3 = new student("Karthikeya",new GregorianCalendar(2005,9,20),(short)3,(float)2.3,(float)4.6);
		}catch(SeatsFilledException e){
			System.out.println(e.tostring());
		}
	}
}