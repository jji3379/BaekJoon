import java.util.Scanner;

public class No_4344 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int n=scan.nextInt();
        double sum=0;
        double count=0;
        for(int i=0; i<n; i++){
            int student=scan.nextInt();
            double[] scoreArr=new double[student];
            for(int j=0; j<student; j++){
                int score=scan.nextInt();
                scoreArr[j]=score;
                sum+=score;
            }
            double avg=sum/student;
            for(int k=0; k<scoreArr.length; k++){
                if(avg<scoreArr[k]){
                    count++;
                }
            }
            //printf 는 형식을 바꿀 수 있음
            System.out.printf("%.3f%%\n",(count/student)*100);
            count=0;
            sum=0;
        }
    }
}
