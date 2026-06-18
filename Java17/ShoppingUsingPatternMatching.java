package Java17;



class Myntra{
    void shopping(){
        System.out.println("Doing shopping from Myntra!!");
    }
}

class WestSide{
    void shopping(){
        System.out.println("Doing Shopping from WestSide!!");
    }
}

class Amazon{
    void shopping(){
        System.out.println("Doing Shopping from Amazon");
    }
}

class FlipCart{
    void shopping(){
        System.out.println("Doing shopping from flipcard");
    }
}

public class ShoppingUsingPatternMatching {
    public static void main(String[] args){
        Object sales= new FlipCart();
        Object sales2 = new Amazon();

        if(sales instanceof Myntra m){
            m.shopping();
        }
        if(sales instanceof Amazon a){
            a.shopping();
        }
    }

}
