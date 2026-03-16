package OOPS;


 class SBI{
	void ROI(double roi) {
		System.out.println("Rate of interest:"+roi+"%");
	}
}
 class BOB extends SBI{
	 void interest(double roi) {
			System.out.println("Rate of interest:"+roi+"%");
		} 
 }
 class BOI extends BOB{
	 void ROILOW(double roi) {
			System.out.println("Rate of interest:"+roi+"%");
		}
 }
public class Test2 {

	public static void main(String[] args) {
		SBI s1=new SBI();
		s1.ROI(9.10);
		BOB b1=new BOB();
		b1.interest(8.5);
		// BOI bi=new BOI();
		// bi.ROI(10.60);
		// bi.interest(8.9);
		// bi.ROILOW(7.5);
	}

}