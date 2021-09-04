package filehandling;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GetLatestDownloadedFiles {

	public static void main(String[] args) {

		List<File> lst = new ArrayList<File>();

		String loc = "C:/Users/" + System.getProperty("user.name") + "/Downloads/";
		File f = new File(loc);
		File[] files = f.listFiles();

		for (File file : files) {
			if (file.getName().endsWith(".txt"))
				lst.add(file);
		}

		System.out.println(lst);

		File result = null;
		long lastMod = Long.MIN_VALUE;

		for (File fl : lst) {

			if (fl.lastModified() > lastMod) {
				lastMod = fl.lastModified();
				result = fl;
			}
		}
		System.out.println(result.getAbsolutePath());

	}

}
