package SamplePackages;

public class LogicalOperators {
	
	int x=22;
	int y=33;
	public void sample12() {
		
		System.out.println(x==y && x!=y);//false
		System.out.println(x<=y && x!=y);//true
		System.out.println(x==y || x!=y);//true
		
		
	}

	public static void main(String[] args) {
		
		LogicalOperators lo=new LogicalOperators();
		lo.sample12();

	}

}
