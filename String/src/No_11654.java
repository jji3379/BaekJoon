import java.io.IOException;
import java.util.Scanner;

public class No_11654 {
    public static void main(String[] args) throws IOException {
        Scanner scan=new Scanner(System.in);
        //아스키 코드는 숫자여서 int로 받는다
        int value=scan.next().charAt(0);
        System.out.println(value);

        /*
        int a=System.in.read();
        System.out.println(a);
         */
    }
}
