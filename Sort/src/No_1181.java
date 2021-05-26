import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class No_1181 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        String query=null;
        String[] arr=new String[n];
        for(int i=0; i<n; i++){
            query=scan.next();
            arr[i]=query;
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if(s1.length()==s2.length()){
                    return  s1.compareTo(s2);
                }else{
                    return s1.length() -s2.length();
                }
            }
        });
        System.out.println(arr[0]);
        for(int i=1; i<n; i++){
            if(!arr[i].equals(arr[i-1])){
                System.out.println(arr[i]);
            }
        }
    }
}
