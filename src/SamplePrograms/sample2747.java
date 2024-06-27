package SamplePrograms;

abstract class Radio{//abastract class
	
	abstract void songs();
	abstract void news();
}

class Television extends Radio{

	@Override
	void songs() {
		
		System.out.println("songs played on the TV...");
		
	}

	@Override
	void news() {
		
		System.out.println("AP Elections news run on the TV...");
		
	}
	
	
}

class LED extends Radio{

	@Override
	void songs() {
	
		System.out.println("songs played on the Radio....");
	}

	@Override
	void news() {
		
		System.out.println("Ap elections run on the Radio....");
		
	}
	
}


public class sample2747 {
	
	public static void main(String[] args) {
		
		
		Television tv=new Television();
		tv.songs();
		tv.news();
		
		LED l=new LED();
		l.songs();
		l.news();
	}

}
