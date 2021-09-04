package oops;

public class LearnEncapsulation {

	
	
	public static void main(String[] args) {
	
	TestData obj = new TestData();
	obj.setEmpName("Mohan");
	obj.setAdd("Bangalore");
	obj.setEmpid(1234);
	obj.setSalary(150000.50);
	
	
	System.out.println(obj.getEmpName());
	System.out.println(obj.getEmpid());
	System.out.println(obj.getSalary());
	
	
	}
	
}
