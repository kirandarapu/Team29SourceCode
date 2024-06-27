package AbstractExamples;

abstract class Bank{
	
	int debit=10000;
	int credit=20000;
	
	//create the constructor
	
	
	
	
	//abstract methods
	abstract void Credit();
	abstract void Debit();
	
	//create non-abstract method 
	
	public void credit() {
		System.out.println("some amount credited...");
	}
	public void debit() {
		System.out.println("some amount debited...");
	}
}

class ICICI extends Bank{

	

	@Override
	void Credit() {
		
		System.out.println("some amount should be credited  "+credit);
		
	}

	@Override
	void Debit() {
		
		System.out.println("some amount should be debited  "+debit);
		
	}
	
	
}


public class AbstractionExamples {

	public static void main(String[] args) {
		
		 ICICI ic=new  ICICI();
		 ic.Credit();
		 ic.Debit();

	}

}
