package filehandling;

import java.io.File;

public class LearnFiles {

	public static void main(String[] args) {
		
		File f = new File("Test.txt");
		System.out.println(f.canExecute());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.getAbsolutePath());

		System.out.println(f.lastModified());
		
		
		
		
	}
	
}
