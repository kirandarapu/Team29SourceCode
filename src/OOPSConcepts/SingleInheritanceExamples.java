package OOPSConcepts;


class Parent{
	
	public void eat() {
		System.out.println("eating food...");
	}
}

class Child extends Parent{
	
	public void run() {
		System.out.println("running on the road....");
	}
}



public class SingleInheritanceExamples {
	
	
	public static void main(String[] args) {
		
		Child c=new Child();
		c.eat();//parent property
		c.run();//child property
		
		
	}
	
	}


