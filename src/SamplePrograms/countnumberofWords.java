package SamplePrograms;

import java.util.Scanner;

public class countnumberofWords {

	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a String");
		
		String s=sc.nextLine();//String values
		
		//next==>String values ==> Java programming language
		//nextline ==> String values  ==> it is accept the spaces
		
		int count=1;
				
		
		for(int i=0;i<s.length()-1;i++) {
			
			
			if( (s.charAt(i)==' ' && s.charAt(i+1)!=' ') ) 
			{//   i==whitespace  && i+1!=whitespace
				count++;
				
			}
			
		}
		System.out.println(s+" "+ count);
		
	}

}
