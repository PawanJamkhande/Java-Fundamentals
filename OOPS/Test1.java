package OOPS;

class Product{
	private int pid;
	
	private String pname;
	
	private int  price;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
public class Test1 {

	public static void main(String[] args) {
		

		Product p1=new Product(); 
		
		p1.setPid(101);
		p1.setPname("Speakers");
		p1.setPrice(2000);
		System.out.println(p1.getPid()+" "+p1.getPname()+" "+p1.getPrice());
	}

}