/*
Create a class called Counter that contains a static data member to count the number of
Counter objects being created. Also define a static member function called
showCount() which displays the number of objects created at any given point of time.
Illustrate this.
*/

import java.io.*;
import java.util.*;

class Counter{
	static int count = 0;
	Counter(){
		count+=1;
	}
	static void showCount(){
		System.out.println(count+" Objects of Counter class are Created!");
	}
}

class q4{
	public static void main(String args[]){
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();

		Counter.showCount();
	}
}