package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class No_15552 {
	public static void main(String[] args) throws Exception{
		//빠른 A+B
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;	
		int T=Integer.parseInt(br.readLine());
			for(int i=0; i<T; i++) {
				st=new StringTokenizer(br.readLine());
				int A=Integer.parseInt(st.nextToken());
				int B=Integer.parseInt(st.nextToken());
				int sum=A+B; //이거 안해주고 bw.write에 바로 A+B 넣어서 오류 났었음
				bw.write(sum+"\n");
			}
			bw.flush();
			bw.close();
			br.close();
	}
}
