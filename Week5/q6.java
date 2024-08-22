/*
Write and execute a Java program to convert strings containing numbers into comma- punctuated numbers, with a comma every third digit from the right.
e.g., Input String: "1234567"
                     7654321
Output String: "1,234,567"
*/

import java.io.*;
import java.util.*;

class q6{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String: ");
        String num = input.nextLine();
        String result = "";
        int count = 0;
        for (int i = num.length() - 1; i >= 0; i--) {
            result = num.charAt(i) + result;
            count++;
            if (count % 3 == 0 && i != 0) {
                result = "," + result;
            }
        }
        System.out.println(result);
    }
}