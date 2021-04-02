import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Kakao_NewID {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String new_id=scan.next();

        //1단계 대문자를 소문자로 바꾸기
        new_id=new_id.toLowerCase(Locale.ROOT);

        //2단계 . - _ . 말고 특수문자 다 지우기
        new_id=new_id.replaceAll("[^-_.a-z0-9]", "");


        //3단계 .. 중복 . 으로 바꾸기
        new_id=new_id.replaceAll("[.]{2,}", ".");

        //4단계 양끝에 있는 . 지우기
        new_id=new_id.replaceAll("^[.]|[.]$", "");

        //5단계 id가 빈 문자열이면 a를 대입
        if(new_id.equals("")){
            new_id=new_id.replaceAll("","a");
        }

        //6단계 16자 이상이면 15자 뒤 다 지우기
        if(new_id.length()>=16){
            new_id=new_id.substring(0,15);
            new_id=new_id.replaceAll("[.]$","");
        }

        //7단계 2자 이하이면 마지막 문자를 길이가 3이 될 때 까지 끝에 붙이기
        if(new_id.length()<3){
            String lastWord=new_id.substring(new_id.length()-1);
            while(new_id.length()<3){
                new_id=new_id.concat(lastWord);
            }
        }

        /*
        //2단계 내 코드
        String[] filter1={"~","!","@","#","$","%","^","&","*","(",")","=","+","[","]","{","}",":","?",",","<",">","/","\""};
        for (int i=0; i<filter1.length; i++){
            if(new_id.contains(filter1[i])){
                new_id=new_id.replace(filter1[i],"");
            }
        }

        //3단계 내 코
        for(int i=0; i<8; i++){
            if(new_id.contains("..")){
                new_id=new_id.replace("..",".");
            }
        }


        //4단계 내 코드
        if(new_id.startsWith(".")){
            new_id=new_id.substring(1);
        }
        if(new_id.endsWith(".")){
            new_id=new_id.replace(new_id.substring(new_id.length()-1),"");
        }

        //6단계 내 코드
        if(new_id.length()>15){
            new_id=new_id.substring(0,15);
            //지웠는데 마지막이 .이면 지우기
            if(new_id.endsWith(".")){
                new_id=new_id.replace(".","");
            }
        }
         */

        System.out.println(new_id);
    }
}
