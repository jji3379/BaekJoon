public class No_4673 {
    public static void main(String[] args) {
        boolean[] isNotSelfNumber=new boolean[10001];

        for(int i=1; i<=10000; i++){
            int value=d(i);
            if(value<=10000){
                isNotSelfNumber[value]=true;
            }
        }
        for(int i=1; i<=10000; i++){
            if(!isNotSelfNumber[i]){
                System.out.println(i);
            }
        }

    }
    public static int d(int number){
        int sum=number;
        while(number>0){
            sum+=number%10;
            number/=10;
        }
        return sum;
    }
}
