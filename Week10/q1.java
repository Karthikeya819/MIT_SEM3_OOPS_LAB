/*
Write a generic method to exchange the positions of two different elements in an array
*/
import java.lang.*;

class q1{
	static <T>void Exchange(T Arr[],int a,int b){
		T temp = Arr[a];
		Arr[a] = Arr[b];
		Arr[b] = temp;
	}
	public static void main(String args[]){
		Integer Arr[] = new Integer[3];
		System.out.print("Initial Array: ");
		for(int i =0;i<3;i++){
			Arr[i] = i+1;
			System.out.print(Arr[i]+" ");
		}
		System.out.println();
		System.out.print("Array after Exchange: ");
		Exchange(Arr,0,2);
		for(int i =0;i<3;i++)System.out.print(Arr[i]+" ");
		System.out.println();
	}
}