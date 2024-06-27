package AbstractExamples;

import java.io.File;
import java.io.FileReader;

public class Classnotfoundexceptionexamples {

	public static void main(String[] args) {
		
	try {
		
		File f=new File("name.txt");
		FileReader fr=new FileReader(f);
	}catch(Exception e) {
		
		e.printStackTrace();
	}

	}

}
