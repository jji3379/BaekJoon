import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Kakao_Crane {
    public int solution(int[][] board, int[] moves) {

        int size=board.length;
        int result[]=new int[size*size];
        ArrayList<Integer> resultlist=new ArrayList<>();

        int answer=0;
        int i=0;

        for(int k=0; k<moves.length; k++){
            for(i=0; i<board.length; i++){
                if(board[i][moves[k]-1]!=0){
                    int movesResult=board[i][moves[k]-1];
                    resultlist.add(movesResult);
                    board[i][moves[k]-1]=0;
                    break;
                }
                for(int j=0; j<resultlist.size(); j++){
                    int currentValue=resultlist.get(j);
                    if(j!=0){
                        int lastValue=resultlist.get(j-1);
                        if(currentValue==lastValue){
                            resultlist.remove(j);
                            resultlist.remove(j-1);
                            answer++;
                        }
                    }
                }
            }
        }
        return answer*2;
    }
}
