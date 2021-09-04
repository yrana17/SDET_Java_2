package basicbuildingblock;

public class LearnConstructorCase {

	String pname;
	int qty;
	int price;
	
	public LearnConstructorCase()
	{
		pname="Shirts";
		qty=15;
		price=500;
	}
	
	public LearnConstructorCase(String pname,int qty, int price)
	{
		this.pname=pname;
		this.qty=qty;
		this.price=price;
	}
	
	public void display()
	{
		System.out.println("Product Name:"+pname);
		System.out.println("Qty:"+qty);
		System.out.println("Price:"+price);
	}
	
	
	public static void main(String[] args) {
		LearnConstructorCase obj = new LearnConstructorCase("Jeans",17,900);
		obj.display();
		obj= new LearnConstructorCase("Shirt",20,700);
		obj.display();
	}
	
	
	
	
}
