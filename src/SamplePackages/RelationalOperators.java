package SamplePackages;

public class RelationalOperators {  //comparision operators

	int x=20;
	int y=30;
	
	public void sample() {
		//==,<=,>=,!=
		System.out.println(x==y); //= assignment operators
		System.out.println(x!=y);//true==20!=30
		System.out.println(y<=x);//==>false//30<=20
		System.out.println(y>=x);// true ==>30>=20
	}
	
	public static void main(String[] args) {
		RelationalOperators ro=new RelationalOperators();
		ro.sample();

	}

}
