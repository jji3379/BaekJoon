import java.util.Scanner;

public class No_1546 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        double n=scan.nextInt();
        double max=0;
        double sum=0;
        double value=0;
        for(int i=0; i<n; i++){
            value=scan.nextInt();
            if(max<value){
                max=value;
            }
            sum+=value;
        }
        double result=sum/n*100/max;
        System.out.println(result);
    }
}
