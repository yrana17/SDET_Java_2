package wrapper;

public class Program1 {

	public static void main(String[] args) {

		int startIdx = 0;
		int lastIdx = 0;

		String str = "Testing123.456isworld123having985.235fun";

		char arr[] = str.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			if (Character.isDigit(arr[i])) {
				startIdx = i;
				break;
			}
		}

		for (int i = startIdx; i < arr.length; i++) {
			if (Character.isDigit(arr[i]) || arr[i] == '.') {
			} else {
				lastIdx = i;
				break;
			}
		}
		
		String strNum= new String(arr);
		System.out.println(strNum.substring(startIdx, lastIdx));
		
		System.out.println(str.substring(startIdx, lastIdx));
	}

}
