package filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {

	public static void main(String[] args) {

		File f = new File("Test.txt");
		try {
			FileReader fr = new FileReader(f);
			int c;

			while ((c = fr.read()) != -1) {
				System.out.println((char) c);
			}
			
			FileWriter fw = new FileWriter(f, true);
			fw.write("Test Method");
			fw.write("\n");
			fw.write("Automation");
			fw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
