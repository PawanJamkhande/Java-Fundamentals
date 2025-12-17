public class Factorial {
    public static void main(String[] args){
        int n = 5;
        System.out.println(findFactorial(n));
    }
    public static int findFactorial(int n){
        if(n == 0){
            return 1;
        }
        int fact = findFactorial(n-1);
        return n*fact;

    }
}
