import java.util.*;
public class Fibonacci {
        private static int fibonacci(int n){
                if(n==1) return 0;
                if(n==2) return 1;
                return fibonacci(n-1)+fibonacci(n-2);
        }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = fibonacci(n);
        System.out.println(ans);
    }
}
