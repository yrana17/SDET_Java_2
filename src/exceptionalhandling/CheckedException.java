package exceptionalhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	public static void main(String[] args)  {

		
		try {
			readFIle();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("After compiler time exception");
		
		
	}
	
	public static void readFIle() throws FileNotFoundException
	{

		FileInputStream fl = new FileInputStream(new File("test.txt"));
	}

}
