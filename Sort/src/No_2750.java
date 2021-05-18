import java.util.Arrays;
import java.util.Scanner;

public class No_2750 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        int value=0;
        for(int i=0; i<n; i++){
            value=scan.nextInt();
            arr[i]=value;
        }
        Arrays.sort(arr);
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
