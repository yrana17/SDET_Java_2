package languagebasics;

public class LearnObjects2 {

	public static void main(String[] args) {

		LearnObjects obj = new LearnObjects();
	
		obj.a=77;
		obj.b=11;
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		obj.additionMethid();
		obj.subtractMethd();
		
		
	}
	
	
	public static void displayInvoiceDetails(int invNo,int itemNo,int qty, float disc, double totAmt, String comment)
	{
		System.out.println("InvoiceNo:"+invNo);
		
		System.out.println("ItemNo:"+itemNo);
		
		CaseExample_RetailStore obj1= new CaseExample_RetailStore();
		System.out.println("ItemNo:"+obj1.itemNo);
		
		System.out.println(disc);
		
		System.out.println("Quantity:"+qty);	
	}

}
