package Training;
import java.util.*;
/*given the 2 inputs m and n 
find the m th prime number add that number till it became single digit then multiply it with the prime number then return the output
ex- 6 7 [input]
6th prime = 13 so 1+3 = 4
4*13 = 52 then the ans is 52*/
public class SumofPrime {
    public static boolean isPrime(int num){
        if(num < 2) return false;
        for(int i=2;i*i<=num;i++){
            if(num%i==0) return false;
        }
        return true;
    }
    static int digitSum(int num){
        while(num>=10){
            int sum =0;
            while(num>0){
                sum +=num%10;
                num/=10;
            }
            num = sum;
        }
        return num;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();

        int count =0;
        int num=1;
        while(count<m){
            num++;
            if(isPrime(num)){
                count++;
            }
        }
        int singleDigit= digitSum(num);
        System.out.println(num*singleDigit);
    }
}
