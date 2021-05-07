import java.util.ArrayList;
import java.util.Scanner;

public class No_3052 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sub=0;
        ArrayList result=new ArrayList();
        for(int i=0; i<10; i++){
            int value=scan.nextInt();
            sub=value%42;
            if(!result.contains(sub)){
                result.add(sub);
            }
        }
        System.out.println(result.size());
    }
}
