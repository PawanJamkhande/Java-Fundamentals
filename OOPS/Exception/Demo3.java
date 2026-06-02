package OOPS.Exception;

public class Demo3 {
    public static void main(String[] args){
        String str = "Programming";
        System.out.println(str);
        try{
        try{
            String str1 = null;
            System.out.println(str1);
            int str2 = 10/0;
            System.out.println(str2);

        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());

        }
        catch(ArithmeticException e){
            System.out.println(e.getLocalizedMessage());
        }

    }catch(Exception e){
        e.getStackTrace();
    }


    
}
}
