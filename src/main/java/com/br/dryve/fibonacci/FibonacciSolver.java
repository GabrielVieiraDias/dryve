package com.br.dryve.fibonacci;

public class FibonacciSolver {

	public void fibo(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(fib(i));
        }
	}
	
    public static int fib(int n) {
        if (n <= 1) return n;
        else return fib(n - 1) + fib(n - 2);
    } 

}
