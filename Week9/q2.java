/*
Write and execute a java program to create and initialize a matrix of integers. Create n
threads( by implementing Runnable interface) where n is equal to the number of rows
in the matrix. Each of these threads should compute a distinct row sum. The main
thread computes the complete sum by looking into the partial sums given by the
threads.
*/
import java.util.*;
class RowSum implements Runnable{
	Thread thr;
	int Matrix[][];int rowid,sum;
	RowSum(int Matrix[][],int rowid){
		thr = new Thread(this);
		this.Matrix = Matrix;
		this.rowid = rowid;
		sum = 0;
		thr.start();
	}
	public void run(){
		for(int i =0;i<Matrix[rowid].length;i++)sum+=Matrix[rowid][i];
	}
}

class q2{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter M:- ");
		int m = input.nextInt();
		System.out.print("Enter N:- ");
		int n = input.nextInt();
		int Matrix[][] = new int[m][n];
		for(int i = 0;i<m;i++){
			for(int j = 0;j<n;j++){
				System.out.print("Enter Element at ("+i+","+j+"): ");
				Matrix[i][j] = input.nextInt();
			}
		}
		int Sum = 0;
		RowSum thrs[] = new RowSum[m];
		for(int i=0;i<m;i++)thrs[i] = new RowSum(Matrix,i);
		for(int i=0;i<m;i++){
			try{
				thrs[i].thr.join();
				Sum+=thrs[i].sum;
			}catch(InterruptedException e){}
		}
		System.out.println("All Elements Sum is "+ Sum);
	}
}