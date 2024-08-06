//Using fact method, compute NCR in the main method.

import java.io.*;
import java.util.*;

class P3b {
    static int fact(int num){
        int ans = 1;
        for(int i = 1; i<= num;i++){
            ans = ans*i;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N :-");
        int N = input.nextInt();
        System.out.print("Enter R :-");
        int R = input.nextInt();
        System.out.println((fact(N))/(fact((N-R))*fact(R)));
    }
}