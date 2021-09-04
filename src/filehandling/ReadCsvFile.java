package filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ReadCsvFile {

	public static List<String> headerList = new ArrayList<String>();
	public static HashMap<Integer,HashMap<String, String>> hm = new HashMap<Integer, HashMap<String,String>>();
	
	public static void main(String[] args) {

		readHeader("Test_csv.csv");
		System.out.println(headerList);
		readData("Test_csv.csv");
		System.out.println(hm);
	}

	public static void readHeader(String filePath) {
		try {
			BufferedReader csvReader = new BufferedReader(new FileReader(filePath));
			String[] data = null;
			String nextRecord;
			while ((nextRecord = csvReader.readLine()) != null) {
				data = nextRecord.split(",");
				headerList = Arrays.asList(data);
				break;
			}
			csvReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void readData(String filePath) {
		try {
			BufferedReader csvReader = new BufferedReader(new FileReader(filePath));
			String[] data = null;
			String nextRecord;
			int cnt = 0;
			while ((nextRecord = csvReader.readLine()) != null) {
				if (cnt != 0)
				{
					data = nextRecord.split(",");
					hm.put(cnt, storeCsv(data));
				}
				cnt=cnt+1;
			}

			csvReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static HashMap<String, String> storeCsv(String[] dataArray)
	{
		HashMap<String, String> mp= new HashMap<String, String>();
		for (int i = 0; i < dataArray.length; i++) {
			mp.put(headerList.get(i),dataArray[i]);	
		}
		
		return mp;
	}
	
	
}
