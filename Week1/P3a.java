//Write a method fact to accept one integer parameter and to find the factorial 
//of a given number.

import java.io.*;
import java.util.*;

class P3a {
    static int fact(int num){
        int ans = 1;
        for(int i = 1; i<= num;i++){
            ans = ans*i;
        }
        return ans;
    }
    public static void main(String[] args) {
       
    }
}