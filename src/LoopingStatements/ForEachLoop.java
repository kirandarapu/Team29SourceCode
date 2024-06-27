package LoopingStatements;

public class ForEachLoop {

	public static void main(String[] args) {
		//it is collecting list of elements
		int arr[]= {10,20,30,40,50,60,70,80,90};
		
		String s[]= {"manual","automation","performance","api"};
		
		//index  no start from 0
		System.out.println(arr[4]);
		for(int a:arr) {
			
			System.out.println(a);
		}
		
//		for(String str:s) {
//			System.out.println(str);
//		}

	}

}
