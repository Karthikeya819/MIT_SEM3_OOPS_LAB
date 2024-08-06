//Write a method reverse to accept one integer parameter and to return the reversed 
//digits of accepted number

import java.io.*;
import java.util.*;

class P2a {
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
        
    }
}