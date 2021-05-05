import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No_1260 {
    public static int[][] arr;
    public static boolean[] visited;

    //DFS(Depth-First Search, 깊이 우선) 메소드
    public static void dfs(int start){
        visited[start]=true;
        System.out.print(start+" ");

        //깊이 우선 이니까 [시작값][연관된 간선]이 존재(1) 이면서(&&)
        //방문한 적이 없는 (visited[i]==false) 것(중복 안되게)을
        //다음 dfs의 시작값으로 지정
        for(int i=1; i<arr.length; i++){
            if(arr[start][i]==1 && visited[i]==false){
                dfs(i);
            }
        }
    }

    //BFS(Breadth-First Search, 너비 우선(wide)) 메소드
    public static void bfs(int start){
        //BFS 는 큐로 구현
        Queue<Integer> queue=new LinkedList<Integer>();

        //큐에 시작값 넣기
        queue.add(start);
        //시작값에 true 대입
        visited[start]=true;
        System.out.print(start+" ");

        //큐가 다 비어있을 때 까지 while 루프 돌림
        while(!queue.isEmpty()){
            //큐의 첫번째 값 참조
            int temp=queue.peek();
            //첫번째 값을 반환하고 제거, 비어 있다면 null
            queue.remove();

            for(int i=1; i< arr.length; i++){
                //큐의 시작값과 연관된 간선이 있고, 방문한 적이 없으면
                if(arr[temp][i]==1 && visited[i]==false){
                    //큐에 추가
                    queue.add(i);
                    visited[i]=true;
                    System.out.print(i+" ");
                }
            }
        }
    }

    //Main 메소드
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        //정점의 개수
        int point=scan.nextInt();
        //간선의 개수
        int line=scan.nextInt();
        //탐색을 시작할 정점의 번호
        int start=scan.nextInt();
        //0부터 시작하는 것을 1로 맞추기 위
        arr=new int[point+1][point+1];

        //간선의 관계
        for(int i=1; i<=line; i++){
            int a=scan.nextInt();
            int b=scan.nextInt();
            //관계가 있는 행렬의 자리를 1로 지정
            //간선이 양방향으로 주어
            arr[a][b]=1;
            arr[b][a]=1;
        }

        //깊이 우선 탐색 (DFS)
        //방문 했는지 확인하기 위한 정점의 개수의 배열 생성함 (시작을 1로 맞추기 위해서 point+1)
        visited=new boolean[point+1];
        dfs(start);
        System.out.println();

        //너비 우선 탐색 (BFS)
        visited=new boolean[point+1];
        bfs(start);
    }
}
