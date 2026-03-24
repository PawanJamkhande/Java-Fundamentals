package Training;
import java.util.*;

class Menu {
    int MenuId;
    String MenuName;
    String MenuType;
    int price;
    int qty;
    Scanner sc = new Scanner(System.in);

    void disp(){
        System.out.println("Enter Menu Type: ");
        MenuType = sc.next();
        System.out.println("Enter Menu Id: ");
        MenuId = sc.nextInt();
        System.out.println("Enter Menu Name: ");
        MenuName = sc.next();
        System.out.println("Enter the price: ");
        price = sc.nextInt();
        System.out.println("Enter Menu Quantity: ");
        qty = sc.nextInt();

        System.out.println(MenuId+" "+MenuName+" "+price+" "+qty);

    }
    void bill(){
        int totalBill=qty*price;
        System.out.println("Total Bill is: "+totalBill);
    }
}
public class demo{
    public static void main(String[] args){
        Menu m = new Menu();
        m.disp();
        m.bill();
    }
}
