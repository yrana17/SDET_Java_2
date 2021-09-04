package loops;

public class LearnForEach {

	public static void main(String[] args) {

		int[] arr= {10,20,15,45,77};
		
		
		for (int i : arr) {
			System.out.println(i);
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
