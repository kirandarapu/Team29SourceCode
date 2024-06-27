package SamplePackages;

public class Sample001 {

	static int maxitems=10;
	
	public static void main(String[] args) {
		
		int selectedItems=15;
		
		if(maxitems<selectedItems) {
			
			throw new ProductsLimtExceededException("selected items value exceeded..");
		}else
		{
			System.out.println("elements should not accept "+selectedItems);
		}
		

	}

}
