package OOPSConcepts;

class parent1{
	
	public void walk() {
		System.out.println("walking on the terrace...");
	}
}

class parent2 extends parent1{
	
	public void sleep() {
		System.out.println("sleeping on the bed....");
	}
}

class child extends parent2 {
	
	public void eat() {
		System.out.println("eating some food....");
	}
}



public class MultiLevelInheritanceExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		child c=new child();
		c.sleep();
		c.eat();
		c.walk();
	}

}
