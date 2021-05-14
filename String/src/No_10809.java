import java.util.Scanner;

public class No_10809 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String query=scan.next();

        for(char i='a'; i<='z'; i++){
            System.out.print(query.indexOf(i)+" ");
        }
    }
}
