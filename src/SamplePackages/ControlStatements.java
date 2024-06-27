package SamplePackages;

public class ControlStatements {

	int a=10;
	int b=15;
	int x=13;
	int y=13;

	public void controls() {

		if(a>=b) {
			System.out.println(x+y);
		}
	}

	//indentation  ctrl+a  ,ctrl+i(proper alignment)

	public void ifelse() {

		if(x<y) {
			System.out.println(a+b);
		}
		else {
			System.out.println(x+y);
		}

	}
	
	public void nestedif() {
		if(x==y) {
			System.out.println(a+b);
			
			if(y>=a) {
				System.out.println(x+y);
				
				if(a<=x) {
					System.out.println(a+b+x+y);
				}
			}
		}
	}
	public static void main(String[] args) {

		//if statement
		ControlStatements obj=new ControlStatements();
		ControlStatements obj1=new ControlStatements();
		
		
		obj.controls();
		obj1.ifelse();
		obj.nestedif();
		
		



	}

}
