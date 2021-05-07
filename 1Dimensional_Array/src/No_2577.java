import java.util.Scanner;

public class No_2577 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();

        int sum=a*b*c;
        int length=(int)(Math.log10(sum)+1);
        String sum2=Integer.toString(sum);
        for(int j=0; j<10; j++){
            int count=0;
            for(int i=0; i<length; i++){
                if(sum2.charAt(i)-'0'==j){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
