import java.io.*;
import java.util.*;

class Main{
	static int N, M;
	static int[] arr, nums;
	static StringBuilder sb;
	
	static void recur(int depth, int idx) {
		if(depth == M) {
			for(int i=0; i<M; i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
			
			return;
		}
		
//		if(idx >= N) return;
		for(int i=idx; i<N; i++) {
			arr[depth] = nums[i];
			recur(depth + 1, i + 1);
		}
	}
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		sb = new StringBuilder();
		arr = new int[M];
		nums = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(nums);
		recur(0, 0);
		
		System.out.println(sb);
	}
}