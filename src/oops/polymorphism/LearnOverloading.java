package oops.polymorphism;

public class LearnOverloading {

	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public void add(int[] arr)
	{
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum=arr[i]+sum;
		}
		System.out.println(sum);
	}
	
	public void add(double a,double b)
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		LearnOverloading obj = new LearnOverloading();
		obj.add(10, 15);
		obj.add(10.50,20.00);
		LearnOverloading.main("Yes we can overload main method");
	}
	
	public static void main(String str)
	{
		System.out.println(str);
	}

}
