package SamplePrograms;

public class Largestelementinarray {

	public static void main(String[] args) {
		
		int a[]= {13,17,21,34,22};
		int max=a[0];
		
		for(int i=1;i<a.length;i++) {
			
			if(a[i]>max) {  //17>13 ==>max ==>17, 17>16 ==max=17
				max=a[i];
			}  //17>13 ,21>17,34>22 ,34==>largest value
		}
		System.out.println(max);

	}

}
