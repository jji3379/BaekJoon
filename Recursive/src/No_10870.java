import java.util.*;
public class No_10870 {
    public static void main(String[] args) {
      Scanner scan= new Scanner(System.in);
      int n=scan.nextInt();
        System.out.println(fibonacci(n));
    }
    static int fibonacci(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
