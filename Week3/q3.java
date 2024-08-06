/*
Define a class Mixer to merge two sorted integer arrays in ascending order with the
following instance variables and methods:
instance variables:
int arr[] //to store the elements of an array
Methods:
void accept() // to accept the elements of the array in ascending order without any duplicates
Mixer mix(Mixer A) // to merge the current object array elements with the parameterized array elements and return the resultant object
void display() // to display the elements of the array
*/

import java.io.*;
import java.util.*;

class Mixer{
	int arr[],N;
	void accept(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter No of Elements in Array: ");
		this.N = input.nextInt();
		this.arr = new int[N];
		for(int i=0;i<this.N;i++){
			System.out.print("Enter Element at "+(i+1)+" Index: ");
			this.arr[i] = input.nextInt();
		}
	}
	void display(){
		for(int i=0;i<this.N;i++){
			System.out.print(this.arr[i]+",");
		}
	}
	Mixer mix(Mixer MixerB){
		int totalElem = this.N + MixerB.N;
		int retint[] = new int[totalElem];
		for(int i=0;i<this.N;i++){
			retint[i] = this.arr[i];
		}
		for(int i=0;i<MixerB.N;i++){
			retint[i+this.N] = MixerB.arr[i];
		}
		// Selection Sort
		for(int i=0;i<totalElem;i++){
			int smalli = i;
			for(int j = i+1;j<totalElem;j++){
				if(retint[j] < retint[smalli])smalli=j;
			}
			int temp = retint[smalli];
			retint[smalli] = retint[i];
			retint[i] = temp;
		}
		Mixer ret = new Mixer();
		ret.N = totalElem;
		ret.arr = retint;
		return ret;
	}
}

class q3{
	public static void main(String args[]){
		Mixer MixerA = new Mixer();
		MixerA.accept();
		Mixer MixerB = new Mixer();
		MixerB.accept();

		Mixer MixerC = MixerB.mix(MixerA);
		MixerC.display();
	}
}