import java.util.Arrays;
import java.util.Scanner;

public class No_1472 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        char[] arr=scan.nextLine().toCharArray();

        Arrays.sort(arr);

        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]);
        }
    }
}
