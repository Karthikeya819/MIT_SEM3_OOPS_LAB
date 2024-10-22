/*
Define a simple generic stack class and show the use of the generic class for two
different class types Student and Employee class objects.
*/

import java.lang.*;

class Stack<T>{
	T Arr[];
	int tos = -1;
	Stack(T Arr[]){
		this.Arr = Arr;
	}
	T pop(){return Arr[tos--];}
	void push(T item){Arr[++tos]=item;}
	void display(){
		System.out.print("Stack Contents: ");
		for(int i = 0;i<=tos;i++)System.out.print(Arr[i]+" ");
		System.out.println();
	}
}

class Student{
	String name;
	int RollNo;
	Student(String name,int RollNo){
		this.name = name;
		this.RollNo = RollNo;
	}
	public String toString(){
		return "[Name: "+name+" Roll No: "+RollNo+"]";
	}
}
class Employee{
	String name;
	int Eid;
	Employee(String name,int Eid){
		this.name = name;
		this.Eid = Eid;
	}
	public String toString(){
		return "[Name: "+name+" Eid: "+Eid+"]";
	}
}

class q2{
	public static void main(String args[]){
		Student Arr[] = new Student[5];
		Stack<Student> stack = new Stack<Student>(Arr);
		stack.push(new Student("Prachet",55));
		stack.push(new Student("Karthikeya",55));
		stack.push(new Student("Nireeksha",56));
		stack.display();
		System.out.println("Popped Out of Stack: "+stack.pop());

		Employee Arr1[] = new Employee[5];
		Stack<Employee> stack1 = new Stack<Employee>(Arr1);
		stack1.push(new Employee("Prachet",55));
		stack1.push(new Employee("Karthikeya",55));
		stack1.push(new Employee("Nireeksha",56));
		stack1.display();
		System.out.println("Popped Out of Stack: "+stack1.pop());


	}
}