//Find the addition of two matrices and display the resultant matrix.

import java.io.*;
import java.util.*;


class P4{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Mat A
		System.out.print("Enter m,n of Mat A:-");
		int m = input.nextInt();
		int n = input.nextInt();
		//Mat B
		System.out.print("Enter m1,n1 of Mat B:-");
		int m1 = input.nextInt();
		int n1 = input.nextInt();

		if(m != m1 || n1 != n ){
			System.out.println("For Matrix Addition Order of Matrix Should be Same!");
			return;
		}

		int MatA[][] = new int[m][n];
		int MatB[][] = new int[m1][n1];



		for(int i = 0;i<m;i++){
			for(int j = 0;j<n;j++){
				System.out.print("Enter Element of Mat A at ("+(i+1)+","+(j+1)+") :-");
				MatA[i][j] = input.nextInt();
			}
		}
		for(int i = 0;i<m;i++){
			for(int j = 0;j<n;j++){
				System.out.print("Enter Element of Mat B at ("+(i+1)+","+(j+1)+") :-");
				MatB[i][j] = MatA[i][j] + input.nextInt();
			}
		}

		for(int i = 0;i<m;i++){
			for(int j = 0;j<n;j++){
				System.out.print(MatB[i][j]+" ");
			}
			System.out.println("");
		}
	}
}