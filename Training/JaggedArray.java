package Training;
import java.util.*;
public class JaggedArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int ja[][]=new int[3][];

        //Assign each row with different coloumn sizes that is array in array (jagged array)
        ja[0]=new int[3];
        ja[1]=new int[2];
        ja[2]=new int[4];

        //take input

        System.out.println("-------Enter arrays elements--------");
        for(int i=0;i<ja.length;i++){
            for(int j=0;j<ja[i].length;j++){
                ja[i][j]=sc.nextInt();
            }
        }
        //print data
        System.out.println("------Printing array elemnts-------");
        for(int i=0;i<ja.length;i++){
            for(int j=0;j<ja[i].length;j++){
                System.out.print(ja[i][j]+" ");
            }
            System.out.println();
        }
    }
}
