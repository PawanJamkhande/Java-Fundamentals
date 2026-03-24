package Training;


public class Product {
	int pid;
	String pName;
	int price;
	
	// default constructor
	Product(){
		String app="BlueCheck";
		System.out.println("App: "+app);
		
	}
	//parameterized constructor
	Product(int pid, String pName, int price){
		this.pid=pid;
		this.pName=pName;
		this.price=price;
	}
	//local
	void info() {
		System.out.println("Product id: "+pid+"\nProduct Name: "+pName+"\nProduct Price: "+price);
	}
	Product(Product name, Product pp){
		pName=name.pName;
		price=pp.price;
		System.out.println(pName+" "+price);
	}
	
}
class demo3{
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product(101,"Sasmo",10000);
		Product p4 = new Product(103,"Kezko",1200);
		p2.info();
		p4.info();
		Product p3 = new Product(p2,p4);
	}
}
