package SamplePackages;

import java.util.Arrays;

public class SampleProgram {

	public static void main(String[] args) {
		String price="$200.98";
		String price1=price.replace("$","");  // remove the dollor sign
		System.out.println(Double.parseDouble(price1)); //converted to number

		
		
int a[]= {500,400,100,200,700};
		
		Arrays.sort(a);
		
		System.out.println("smallest number:"+a[0]);
		
		System.out.println("$"+a[0]);
	}

}
