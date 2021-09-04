package filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader {

	public static void main(String[] args) {

		java.io.BufferedReader br;
		try {
			br = new java.io.BufferedReader(new FileReader(new File("Test.txt")));

			String line = null;
			while ((line = br.readLine()) != null)
				System.out.println(line);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
