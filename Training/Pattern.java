package Training;
import java.util.*;

import javax.sound.sampled.SourceDataLine;
public class Pattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter line of pyramid");
        int n = sc.nextInt();

        for(int i=0;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("----------Inverted Pyramid---------");
        for(int i=n;i>=0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-----------Inverted Number Pyramid---------");
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                // System.out.print(i+" ");
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("------INverted-------");
        for(int i=n;i>=1;i--){
            for(int j=1;j<n;j++){
                System.out.print(" ");
            }
            for( int k = 1;k<=i;k++){
                System.out.print(" *");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            char ch ='A';
            for(int j=1;j<=i;j++){
                System.out.println(ch+" ");
            }
        }
    }
}
