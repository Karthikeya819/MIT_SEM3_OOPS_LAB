//Write a program that creates an integer array of length N, fills the array with the
//sequence of values (from 1 to N) using a for loop, and then loops through the array
//printing out the values. Use a for-each style for loop to print out the values.


import java.io.*;
import java.util.*;

class P2{
	public static void main(String args[]){
		System.out.print("Enter N :-");
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int Array[] = new int[N];
		for(int i = 1;i < N+1;i++){
			Array[i-1] = i;
		}
		for(int num:Array){
			System.out.print(num+" ");
		}
	}
}