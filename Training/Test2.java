package Training;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		int i =1;
		do {
			System.out.println(i);
			i++;
			}while(i<=10);
		
		System.out.println("---------------------");
		
		int j=10;
		do {
			System.out.println(j);
			j--;
		}while(j>=1);
		System.out.println("----------------");
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter range:");
		int n= sc.nextInt();
		int k=1;
		int sum=0;
		do {
			sum=sum+n;
			k++;
			
		}while(k<=n);
		System.out.println("total sum :"+ sum);
		

	}

}