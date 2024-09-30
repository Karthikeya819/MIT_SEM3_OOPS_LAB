/*
Define a class Maximum with the following overloaded static methods
a. max (which finds maximum among three integers and returns the maximum
integer)
b. max (which finds maximum among three floating point numbers and returns the
maximum among them)
c. max (which finds the maximum in an array and returns it)
d. max (which finds the maximum in a matrix and returns the result)
Place this in a package called myPackages.p1. Write a main method to use the
methods of Maximum class in package p1.
*/
import myPackages.p1.*;

class q2{
	public static void main(String args[]){
		int Arr[][] = {{1,2,3}};
		System.out.println(Maximum.max(Arr));
		int Arr1[] = {1,2,3};
		System.out.println(Maximum.max(Arr1));
		System.out.println(Maximum.max(1,2,3));
		System.out.println(Maximum.max((float)0.1,(float)0.2,(float)0.3));
	}
}