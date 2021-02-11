import java.util.Arrays;
import java.util.Scanner;

public class No_10818 {
    public static void main(String[] args) {
        int max=0;
        int min=0;

        Scanner scan=new Scanner(System.in);

        int N=scan.nextInt();
        int[] value=new int[N];

        for(int i=0; i<N; i++) {
            value[i] = scan.nextInt();
        }
        Arrays.sort(value);

        System.out.print(value[0]+" "+value[N-1]);
    }
}
