import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
//큐 1
public class No_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=null;
        Queue<Integer> queue=new LinkedList<>();
        int n=Integer.parseInt(br.readLine());
        int newValue=0;
        for(int i=0; i<n; i++){
            st=new StringTokenizer(br.readLine());
            switch (st.nextToken()){
                case "push":
                    newValue=Integer.parseInt(st.nextToken());
                    queue.offer(newValue);
                    break;
                case "pop":
                    if(queue.isEmpty()){
                        System.out.println(-1);
                    }else{
                        System.out.println(queue.poll());
                    }
                    break;
                case "size":
                    System.out.println(queue.size());
                    break;
                case "empty":
                    if(queue.isEmpty()){
                        System.out.println(1);
                    }else{
                        System.out.println(0);
                    }
                    break;
                case "front":
                    if(queue.isEmpty()){
                        System.out.println(-1);
                    }else{
                        System.out.println(queue.peek());
                    }
                    break;
                case "back":
                    if(queue.isEmpty()){
                        System.out.println(-1);
                    }else{
                        System.out.println(newValue);
                    }
                    break;
            }
        }
    }
}
