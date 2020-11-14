package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for (int i = 0; i <5 ; i++) {
            System.out.println(fib(i));

        }

    }
    public static int fib(int N) {
        if (N == 0) {
            return 0;
        }
        else if (N == 1) {
            return 1;
        } else {
            return fib(N - 1) + fib(N - 2);
        }
    }


}
