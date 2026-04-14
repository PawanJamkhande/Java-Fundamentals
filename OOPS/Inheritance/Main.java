package OOPS.Inheritance;

public class Main {

	public static void main(String[] args) {
		
		Admin a=new Admin();
		
		Customer c=new Customer();
		
		a.username="Sam Dao";
		a.login();
		a.insertProduct("Shoose",2,10000);
		a.insertProduct("Saree", 10, 15000);
		a.insertProduct("bag",1, 500);
		a.showProductDetails();
		a.logout();
	
		
		c.username="Ankita Sharma";
		
		c.login();
		c.addtoCart(a.p[0]);
		//c.addtoCart(a.p[1]);
		c.gcandplaceOrder();
		c.logout();

	}

}
