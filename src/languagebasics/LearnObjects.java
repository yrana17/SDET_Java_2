package languagebasics;

public class LearnObjects {

	int a = 15;
	int b = 10;

	public static void main(String[] args) {

		LearnObjects learnObjects = new LearnObjects();

		System.out.println(learnObjects.a);
		System.out.println(learnObjects.b);

		learnObjects.additionMethid();

		learnObjects.subtractMethd();

	}

	public void additionMethid() {
		System.out.println(a + b);
	}

	public void subtractMethd() {
		System.out.println(a - b);
	}

}
