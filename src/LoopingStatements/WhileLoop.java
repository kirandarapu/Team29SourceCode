package LoopingStatements;

import java.util.Scanner;

public class WhileLoop {
	
	int n;
	public void sample() {
		//we need to provide the data at the time of runnig the program
	Scanner sc=new Scanner(System.in);
	System.out.println("enter value");
	
	n=sc.nextInt();
	//i need to print 1-10 values print
	while(n<=10) {
		
		System.out.println(n);
		n++;
	}
	
	}

	public static void main(String[] args) {
		
		WhileLoop wl=new WhileLoop();
		wl.sample();

	}

}
