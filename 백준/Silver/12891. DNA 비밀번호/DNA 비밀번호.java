import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());	// 입력받는 문자열 길이 최대 1,000,000
		int m = Integer.parseInt(st.nextToken());	// 만들 비밀번호 길이
		
		String s = br.readLine();
		int[] acgt = new int[4];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<4; i++) {
			acgt[i] = Integer.parseInt(st.nextToken());
		}
		
		int result = 0;
		int[] dnaCnt = {0, 0, 0, 0};
		
		for(int i=0; i < m; i++) {
			if(s.charAt(i) == 'A') dnaCnt[0] ++;
			else if(s.charAt(i) == 'C') dnaCnt[1] ++;
			else if(s.charAt(i) == 'G') dnaCnt[2] ++;
			else if(s.charAt(i) == 'T') dnaCnt[3] ++;
		}
		if(dnaCnt[0] >= acgt[0] && dnaCnt[1] >= acgt[1] && dnaCnt[2] >= acgt[2] && dnaCnt[3] >= acgt[3]) {			
				result++;
		}
		
		int f = 0;
		int b = m;
		while(b < n) {
			
			if(s.charAt(f) == 'A') dnaCnt[0] --;
			else if(s.charAt(f) == 'C') dnaCnt[1] --;
			else if(s.charAt(f) == 'G') dnaCnt[2] --;
			else if(s.charAt(f) == 'T') dnaCnt[3] --;
			
			if(s.charAt(b) == 'A') dnaCnt[0] ++;
			else if(s.charAt(b) == 'C') dnaCnt[1] ++;
			else if(s.charAt(b) == 'G') dnaCnt[2] ++;
			else if(s.charAt(b) == 'T') dnaCnt[3] ++;
			
			if(dnaCnt[0] >= acgt[0] && dnaCnt[1] >= acgt[1] && dnaCnt[2] >= acgt[2] && dnaCnt[3] >= acgt[3]) {			
				result++;
			}
			b ++;
			f ++;
		}
		System.out.println(result);
	}
}