package SamplePackages;

public class AssignmentOperators {

	int a=13;
	int b=15;
	public void sample13() { //method body
		
		System.out.println(a=b); //==>15 a=b==15
		System.out.println(a+=b);//28  ==>15+15==30 a=a+b==>15+15=30
		System.out.println(a-=b);// ==>2  ==>15  ==>a=a-b==>30-15==15
		
		System.out.println(a*=b);  // 15*15==>225
		System.out.println(a/=b);//==>225/15==>15 ==>coeccient value
		System.out.println(a%=b); //remainder==>2   15%15==>0
		
	}
	
	public static void main(String[] args) {
		
		AssignmentOperators ao=new AssignmentOperators();
		ao.sample13();
	}

}
