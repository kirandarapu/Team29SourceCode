package SamplePrograms;

import java.util.Scanner;

public class DaysinMonths {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int numofdaysinmonth=0;
		
		String monthname="";
		System.out.println("enter month name");
		
		int month=sc.nextInt();//it is accepting only integer values
		System.out.println("enter year");
		
		int year=sc.nextInt();
		
		switch(month) {
		
		case 1:
			monthname="January";
			numofdaysinmonth=31;
			break;
			
		case 2:
			monthname="Febrauary";
			if((year%400==0)||((year%4==0)&&(year%100!=0))){
				numofdaysinmonth=29;
			}else {
				numofdaysinmonth=28;
				
			}
			break;
			
		case 3:
			monthname="March";
			numofdaysinmonth=31;
			break;
		
		case 4: 
			monthname="April";
			numofdaysinmonth=30;
			break;
			
		case 5:
			monthname="May";
			numofdaysinmonth=31;
			break;
			
		case 6:
			monthname="June";
			numofdaysinmonth=30;
			break;
			
		case 7:
			monthname="July";
			numofdaysinmonth=31;
			break;
			
		case 8:
			monthname="August";
			numofdaysinmonth=31;
			break;
			
		case 9:
			monthname="September";
			numofdaysinmonth=30;
			break;
			
		case 10:
			monthname="October";
			numofdaysinmonth=31;
			break;
			
		case 11:
			monthname="November";
			numofdaysinmonth=30;
			break;
			
		case 12:
			monthname="December";
			numofdaysinmonth=31;
			break;
			
	
		}
		
		System.out.println(monthname+" " + year + " " +numofdaysinmonth);

	}

}
