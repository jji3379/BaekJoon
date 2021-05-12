import java.util.Scanner;

public class No_11720 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        String value=scan.next();
        int sum=0;

        for(int i=0; i<n; i++){
            //charAt() 은 해당 문자의 아스키코드 값을 반환
            //입력 받은 숫자값 그대로를 사용 하려면 -48 or -'0' 입력해야함 ("" 안됨 '' 써야함)
            sum+=value.charAt(i)-'0';
        }
        System.out.println(sum);
    }
}
