package languagebasics;

public class CaseExample_RetailStore {

	/**
	 * Variables,Data Types, Fields
	 */
	int invoiceNo=100;
	int itemNo=12;
	int qtyOfItems;
	float discount;
	double totalAmount;
	String comments;
	
	/**
	 * Function/Method declaration
	 * @param invNo : this is the bill no
	 * @param itemNo : this is the item id that customer want to purchase
	 * @param qty : no of items bought
	 * @param disc : discount provided
	 * @param totAmt : total bill
	 * @param comment : description of item bought
	 */
	public void displayInvoiceDetails(int invNo,int itemNo,int qty, float disc, double totAmt, String comment)
	{
		System.out.println("InvoiceNo:"+invNo);
		System.out.println("Global InvoiceNo:"+invoiceNo);
		
		System.out.println("ItemNo:"+itemNo);
		
		CaseExample_RetailStore obj1= new CaseExample_RetailStore();
		System.out.println("ItemNo:"+obj1.itemNo);
		
		System.out.println(disc);
		
		System.out.println("Quantity:"+qty);	
	}
	
	
	public static void main(String[] args) {
		
		CaseExample_RetailStore obj = new CaseExample_RetailStore();
		
		obj.invoiceNo=200;
		
		//Function Calling within same class using object
		obj.displayInvoiceDetails(obj.invoiceNo, 7, 999, 123.451f, 987564.52, "Invoice for Buying Inverters");
		
		//FUnction calling for Static Method
		//No need to define objects for same
		LearnObjects2.displayInvoiceDetails(obj.invoiceNo, 8, 999, 123.451f, 987564.52, "Invoice for Buying Inverters");
		
		
		
		
		
		
	}
	
	
	
	
	
	
}