package Training;

public class Array {
    public static void main(String[] args){
        String name ="Sam"; // replaces by john bcz used same variable name so the latest name will be stored in the variable
        name = "John";
        System.out.println("Name: "+name);
        System.out.println("--------------------------");

        String names[] ={"sam","john","christopher","ram","sita"};
        for(String n:names){
            System.out.println("Name: "+n);
        } 
        
        int a[] = new int[5];
        a[0]=300;
        a[1]=400;
        a[2]=500;
        a[3]=600;
        a[4]=700;
        System.out.println("---------------------------");
        for(int x:a){
            System.out.println("Elements are: "+x);
        }


    }
    
}
