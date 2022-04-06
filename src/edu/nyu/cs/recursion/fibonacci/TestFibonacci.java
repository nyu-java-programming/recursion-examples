package edu.nyu.cs.recursion.fibonacci;

public class TestFibonacci {

	public static void main(String[] args) {
		
		// get a few numbers from the Fibonacci Sequence
		for (int i=1; i<15; i++) {
			int num = Fibonacci.fibonacci(i); // get the number
			System.out.println( num ); // print it out
		}

	}

}
