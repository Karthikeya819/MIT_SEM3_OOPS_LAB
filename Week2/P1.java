//Write a program that creates an array of integers and then uses a for loop to reverse
//the order of the elements in the array.

import java.io.*;
import java.util.*;

class P1{
	public static void main(String args[]){
		int N = 10;
		int Array[] = new int[N];
		for(int i = 0;i<=N-1;i++){
			Array[i] = i;
		}
		for(int j = 0;j<(N/2);j++){
			int temp = Array[j];
			Array[j] = Array[N-j-1];
			Array[N-j-1] = temp;
		}
		for(int i = 0;i<N;i++){
			System.out.print(Array[i] + " ");
		}
	}
}