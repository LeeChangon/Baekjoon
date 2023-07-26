import java.util.*;
import java.io.*;

public class Main {
	static int N;
	static int S;
	static int cnt = 0;
	static int[] arr;
	
	static void cal(int depth, int sum) {
		if(depth == N) {
			if(sum == S) {
				cnt++;
			}
			return;
		}
		cal(depth + 1, sum);
		cal(depth + 1, sum + arr[depth]);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());
		
		arr = new int[N];
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		cal(0, 0);
		if(S == 0) cnt--;
		System.out.println(cnt);
	}
}