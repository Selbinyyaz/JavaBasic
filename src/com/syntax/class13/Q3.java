package com.syntax.class13;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write JP to print first 10 numbers of Fibonacci series
		 * 0 1 1 2 3 5 8
		 */
		
		
		int a=0;
		int b=1;
		int c;
		
		for(int i=1; i<=10; i++) {
			
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
	}

}
