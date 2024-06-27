package SamplePackages;

public class ElseIfStatements {
	
	int x=33;
	int y=44;
	int z=55;
	
	
	public void sample() {
		
		//if else( exp_title,act-title), else if(cross browser testing )
		
	if(x>y) {
		
		System.out.println(x+y+z);//132
	}
	else if(y<x) {
		System.out.println(y+z);//99
	}
	else if(z<x) {
		System.out.println(z+x);
	}
	else if(z==x) {
		
	}
	else {
		System.out.println(x);
	}
		
	}

	public static void main(String[] args) {
		
		ElseIfStatements ei=new ElseIfStatements();
		ei.sample();

	}

}
