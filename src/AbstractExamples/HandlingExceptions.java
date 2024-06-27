package AbstractExamples;

public class HandlingExceptions {

	static double balance=10000.00;
	public static void main(String[] args) {
		
		
		int withdraw=12000;
		
		if(withdraw<balance) { //12000>10000
			
			throw new InsufficientBalanceException("No Balance");
		}
		
		else {
			
			balance-=withdraw; // 10000 -=12000 ==> 10000-12000=remaining amonut
			System.out.println("remaining balance"+balance);
		}
		

	}

}
