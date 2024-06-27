package StringMethods;

import java.util.Arrays;

public class StringMethodsExamples {

	public static void main(String[] args) {
		
		String s="Automation";//10
		
		//length
		System.out.println(s.length());
		
		//charAt 
		System.out.println(s.charAt(9));//m
		
//		//indexOF
		System.out.println(s.indexOf('n'));
		
		//webtables handling's
		
		//toUpperCase
		
		System.out.println(s.toUpperCase());
		
		//toLowerCase
		System.out.println(s.toLowerCase());
		
		//concat()==>append the values
		
		//testing + automation  ==> testing automation
		
		System.out.println(s.concat("Testing"));
		
		System.out.println(s);//Automation
		
		//isEmpty ==> boolean values (true/false) //verification
		System.out.println(s.isEmpty());//false
		String s1="";
		System.out.println(s1.isEmpty());
		
		//trim( it is clear the white spaces starting and endinng
		
		//" testing ";
		
		String s2=" Manual ";
		
		System.out.println(s2.trim());
		
		//compared to==> bompared to 2 strings
		
		//System.out.println(s.compareTo(s2));  
		
		//System.out.println(s.compareTo("tion"));
		
		//Automation     //manual
		//Amnua  ==> toil
		
	//	==>indexof
		//String s=testing ==>
		
		//Split,RelpaceAll,SubString,CompareTo,IndexOF
		
		String str="Automation Test#" ;  //84
		String str2="Automation Test,";  //116  ==>-32
		
		//lexographic
		//ASCII==> american standard code for information interchanges
		
		
		System.out.println(str.indexOf('T'));
		//web tables handling
		//115 pages
		//0- ==>
		
		//System.out.println(str.compareTo(str2));
		
		System.out.println(str.indexOf('g'));
		System.out.println(str.charAt(15));
		
		//-32
		
		//compareTo  ==>lexographic(two strings compare
		
		System.out.println(str.compareTo(str2));
		
		//105-73 ==>32   ==> 35-44 ==>-9
		
		//Sub String  ==> extract the substring from the main string
		
		  //Testing ==>sti ==> substring (string index no,ending index no);
		                     //   (1,5)
		
		String s11="Manual";
		System.out.println(s11.substring(2, 4));
		
		//Split() ==>split the string into multiple parts based on the delimeter
		
		String str11="Java&Programming&Language";
		//( //,*,%,^,$,())==> cannot use as delimeters
		String a[]=str11.split("&");  //==>white spaces
		System.out.println(Arrays.toString(a));
		
		String str12="Java, #Object, #oriented, #programming, #langauge";
		
		String[] str13=str12.split(",");
		System.out.println(Arrays.toString(str13));
		
		String[] String14=str12.split("#");
		System.out.println(Arrays.toString(String14));
		
		//array values convert into string format ==>toString method
		
		String str18=" j a v a ";
		System.out.println(str18);
		System.out.println(str18.trim());
		
		//replace method
		System.out.println(str18.replaceAll("\\s", ""));
		
		String st="testing";
		String st1="Selenium";
		
		System.out.println(st.replaceAll(st, st1));
		
		System.out.println(st);//testing
         //string is immutable
	}

}
