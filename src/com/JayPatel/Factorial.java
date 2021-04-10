package com.JayPatel;

public class Factorial {


    public long factorial(int n) {
        long ans;
        if (n == 1) return 1;
        else if (n ==2) return 2;
        else {
            ans = n * factorial(n - 1);
            --n;
            return ans;
        }
    }
}
