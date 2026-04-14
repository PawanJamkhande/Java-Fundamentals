package OOPS.Inheritance;


public class Admin extends User{

	Product[]p=new Product[3];
	
	int count=0; //refernce variable to add no of product to array
	
	public void insertProduct(String pname,int qty,double prise ) {
		if(count<p.length) {
			//calling constructor
			p[count]=new Product(pname,qty,prise);
			count++;
			System.out.println(pname+" "+qty+" "+prise+"added product successfully!!");
		}

	else {
		System.out.println("Product array is full!!!");
	}
	}
	public void showProductDetails() {
		for(int i=0;i<count;i++) {
			System.out.println(i+" "+p[i].pname+" "+p[i].qty+" "+p[i].prise);
		}
		
	}
}