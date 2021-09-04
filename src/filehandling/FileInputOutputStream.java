package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStream {

	public static void main(String[] args) {

		File f = new File("Test.txt");
		try {
			FileInputStream fis = new FileInputStream(f);

			int content;

			while ((content = fis.read()) != -1)
				System.out.print((char) content);

			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			FileOutputStream fout = new FileOutputStream(f,true);
			String str = "We want to learn Selenium";
			fout.write(str.getBytes());
			fout.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
