package OOPSConcepts;

class Parent11{
	
	public void read() {
		System.out.println("reading the books...");
	}
}

class child1 extends Parent11{
	public void Study() {
		System.out.println("study the books...");
	}
}

class child2 extends Parent11{
	public void games() {
		System.out.println("playing games on the ground...");
	}
}



public class HeirarichalInheritanceExamples {

	public static void main(String[] args) {
	
		child1 c1=new child1();
		c1.Study();
		c1.read();
		
		child2 c2=new child2();
		
		c2.games();
		c2.read();
		
		
	}

}
