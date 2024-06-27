package SamplePackages;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotfoundExceptionExamples {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		//FileReader f=new FileReader("employes.txt");
		
		try {
			FileReader fr=new FileReader("employes.txt");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
