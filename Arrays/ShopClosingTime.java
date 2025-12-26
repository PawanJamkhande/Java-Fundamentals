import java.util.Scanner;

public class ShopClosingTime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(bestClosingTime(s));
    }
    public static int bestClosingTime(String customers){
        int penalty =0;
        for(int i=0;i<customers.length();i++){
            if(customers.charAt(i) == 'Y'){
                penalty++;
            }
        }
        int minPenalty = penalty;
        int bestHour =0;

        for(int i=0;i<customers.length();i++){
            if(customers.charAt(i)=='Y'){
                penalty--;
            }else{penalty++;}
            if(penalty<minPenalty){
                minPenalty = penalty;
                bestHour = i+1;

            }
        }
        return bestHour;
    }
}

    

