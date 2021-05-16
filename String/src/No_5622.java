import java.util.Scanner;

public class No_5622 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String query=scan.next();

        int time=0;
        for(int i=0; i<query.length(); i++){
            char code=query.charAt(i);
            if(code=='A'|code=='B'|code=='C'){
                time+=3;
            }else if(code=='D'|code=='E'|code=='F'){
                time+=4;
            }else if(code=='G'|code=='H'|code=='I'){
                time+=5;
            }else if(code=='J'|code=='K'|code=='L'){
                time+=6;
            }else if(code=='M'|code=='N'|code=='O'){
                time+=7;
            }else if(code=='P'|code=='Q'|code=='R'|code=='S'){
                time+=8;
            }else if(code=='T'|code=='U'|code=='V'){
                time+=9;
            }else if(code=='W'|code=='X'|code=='Y'|code=='Z'){
                time+=10;
            }
        }
        System.out.println(time);
    }
}
