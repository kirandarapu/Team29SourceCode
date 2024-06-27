package SamplePrograms;

public class SumofElementsinArray {

	public static void main(String[] args) {
		
		int a[]= {11,12,13,14,15};
		
		int sum=0;
		for(int i=0;i<a.length;i++) {
			
			sum=sum+a[i];//  0+11==>11,11+12=23,23+13=36,36+14=50,50+15=65
		}
		System.out.println(sum);
		

	}

}
