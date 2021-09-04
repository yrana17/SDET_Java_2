package arrays;

public class PrintZeroees {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print(0);

			System.out.println();
		}
	}
}
