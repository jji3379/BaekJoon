import java.util.Scanner;

public class No_8958 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        String query=null;
        int count=0;
        int sum=0;
        for(int i=0; i<n; i++){
            query=scan.next();
            for(int j=0; j<query.length(); j++){
                char value=query.charAt(j);
                if(value=='O'){
                    count++;
                }else{
                    count=0;
                }
                sum+=count;
            }
            System.out.println(sum);
            sum=0;
            count=0;
        }
    }
}
