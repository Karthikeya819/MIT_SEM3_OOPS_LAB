/*
Write a program to demonstrate the use of wildcard arguments.
*/

import java.lang.*;

class Test<T extends Number>{
	T value;
	Test(T value){
		this.value = value;
	}
	boolean CompareTo(Test<?> a){
		return value.doubleValue() == a.value.doubleValue();
	}
}

class q3{
	public static void main(String args[]){
		Test<Integer> TI = new Test<Integer>(5);
		Test<Number> TN = new Test<Number>(5.0);
		System.out.println(TI.CompareTo(TN));
	}
}