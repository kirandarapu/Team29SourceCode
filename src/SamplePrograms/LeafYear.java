package SamplePrograms;

import java.util.Scanner;

public class LeafYear {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter year");
		
		int year=sc.nextInt();
		
		boolean  a=((year%4)==0); //true/false
		boolean b=(year%100!=0);
//		boolean c=((year%400==0));
		
		//condition?(expression1):(expression2)
		
		
		
		if(a&&b) {   //year&&a
			
			System.out.println(year+" this is a leaf year");
			
		}else
		{
			System.out.println(year+"this is not a leaf year");
		}
		
		

	}

}
