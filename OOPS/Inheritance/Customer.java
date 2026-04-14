package OOPS.Inheritance;


public class Customer extends User {
	Product[]cart=new Product[3];
	
	int ccount=0;
	
	public void addtoCart(Product p) {
		
		if(ccount<cart.length) {
			cart[ccount]=p;
			System.out.println(p.pname+" added successfully");
			ccount++;
		}
		else {
			System.out.println("Cart is full!!!");
		}
	}
	public void gcandplaceOrder() {
		double totalprise=0;
		System.out.println("\n--------Bill-------");
		for(int i=0;i<ccount;i++) {
			System.out.println(cart[i].pname+" "+cart[i].qty+" "+cart[i].prise);
			totalprise+=cart[i].prise;
		}
		System.out.println("Total Bill:"+totalprise);
		
		
	}
	
	
}
