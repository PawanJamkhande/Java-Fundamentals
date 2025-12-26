public class PrintIncreasing{
    public static void main(String[] args){
        PrintIncreasing1(7);
    }
    public static void PrintIncreasing1(int N){
        if(N==0)
            return;
        PrintIncreasing1(N-1);
        System.out.println(N);
    }
}