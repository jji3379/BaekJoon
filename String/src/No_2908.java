import java.util.Scanner;

public class No_2908 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int value1=sc.nextInt();
        int value2=sc.nextInt();

        //StringBuilder().append().reverse() 로 뒤집을 수 있다.
        value1=Integer.parseInt(new StringBuilder().append(value1).reverse().toString());
        value2=Integer.parseInt(new StringBuilder().append(value2).reverse().toString());

        System.out.println(value1 > value2 ? value1 : value2);
    }
}
