package myPackages.p1;
/*
Define a class Maximum with the following overloaded static methods
a. max (which finds maximum among three integers and returns the maximum
integer)
b. max (which finds maximum among three floating point numbers and returns the
maximum among them)
c. max (which finds the maximum in an array and returns it)
d. max (which finds the maximum in a matrix and returns the result)
*/

public class Maximum{
	public static int max(int a,int b,int c){
		if(a>b && a>c)return a;
		else if(b>a && b>c)return b;
		else return c;
	}
	public static float max(float a,float b,float c){
		if(a>b && a>c)return a;
		else if(b>a && b>c)return b;
		else return c;
	}
	public static int max(int Arr[]){
		int max = Arr[0];
		for(int i =0;i < Arr.length;i++){
			if(Arr[i]>max)max=Arr[i];
		}
		return max;
	}
	public static int max(int Arr[][]){
		int max = Arr[0][0];
		for(int i =0;i < Arr.length;i++){
			for(int j = 0;j<Arr[i].length;j++){
				if(Arr[i][j] > max)max = Arr[i][j];
			}
		}
		return max;
	}
	
}