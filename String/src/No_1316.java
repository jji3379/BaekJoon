import java.util.Scanner;

public class No_1316 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int count=n;
        String query="";

        for (int i=0; i<n; i++) {
            query=scan.next();
            int temp = -1; //직전 문자의 인덱스
            int index = -1; //배열의 인덱스
            boolean[] array = new boolean[26];
            for (int j = 0 ; j < query.length(); j ++) {
                // 알파벳의 flag가 들어갈 배열을  설정

                if(query.length() == 1 ) { // 1글자면 반복문을 탈출
                    break;
                }

                index = (int) query.charAt(j) - (int)'a';  // 배열의 인덱스에 맞게 조정 ( a : 0 ~ z : 25 )

                if( index != temp ) { // 새로운 문자가 나오면
                    temp = index;
                    if(array[temp] == true) { // 새로 검사하는 문자를 이전에 검사했으면
                        count --;
                        break;
                    }
                    array[temp] = true;  // 인덱스에 true를 저장
                }
            }
        }
        System.out.println(count);
    }
}
