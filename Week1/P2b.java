//Using this method, check whether the inputted number is palindrome or not.


import java.io.*;
import java.util.*;

class P2b {
    static int reverse(int num){
        int reverse = 0;
        while(num != 0){
            int remainder = num % 10;
            num = num / 10;
            reverse = reverse*10 + remainder;
        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number :-");
        int num = input.nextInt();
        int rev = reverse(num);
        if(rev == num){
            System.out.println("It's a Palindrome!");
        }else{
            System.out.println("It's not a Palindrome!");
        }
    }
}