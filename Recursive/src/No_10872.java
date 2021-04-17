import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int pec=1;
        for(int i=N; i>0; i--){
            pec*=i;
        }
        System.out.println(pec);
    }
}
