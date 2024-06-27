package StringMethods;

public class StringBufferExamples {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Automation Testing");
		
		//append,reverse,insert,....
		
		sb.append("Selenium Tool");
		System.out.println(sb);//
		
		
		//append method
		StringBuffer str=new StringBuffer("Java Programming Language");
        System.out.println(str.append("(oops)"));
        
        //reverse
        System.out.println(str.reverse());
        StringBuffer str2=new StringBuffer("MadaM");
        System.out.println(str2.reverse());
        
        //insert
        System.out.println(str2.insert(2, "R"));
        
        //delete  //mardam==>rd
        System.out.println(str2.delete(2, 4));
        
       // ==> default capacity ==>16
        
        // (dafaultcapacity*2)+2==> (16*2)+2==>34
        //34*2)+2==>70, 7)*2
        
        StringBuffer sb2=new StringBuffer();
        //16 values(0-16)(34)(70)
        
        StringBuilder sb1122=new StringBuilder("Testing");
        
        sb1122.append("");
        sb1122.reverse();
        sb1122.insert(0, false);
        sb1122.delete(0, 0);
        System.out.println(sb1122.length());
        
        
        int a[]= {10,20,30,40,50,60};
        
         int arr[][]= {{10,20,30},{40,50,60}};
         
         int ar[][]=new int[2][2];
          ar[0][0]= 10;
          ar[0][1]=20;
          ar[1][0]=30;
          ar[1][1]=40;
          
        for(int i=0;i<2;i++) {
        	
        	for(int j=0;j<2;j++) {
        		System.out.print(ar[i][j]);
        	}
        	System.out.println(" ");
        }
          
        Object obj[]= {"Java",101,true,13.5,'D'};
        
     /*   for(Object x:obj) {
        	
        	System.out.print(x+"  ");
        }
        System.out.println();
        
         */ 
        
        for(int i=0;i<=obj.length;i++) {
        	System.out.println(obj[i]);
        }
	}

}
