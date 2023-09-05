import java.io.*;
import java.util.*;

public class Main {
	static int N;
	static int M;
	static int[] nums;
	static int[] arr;
	static List<String> result;
	static StringBuilder sb;
	
	static void recur(int depth) {
		if(depth == M) {
//			StringBuilder sb = new StringBuilder();
			for(int i=0; i<M; i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
//			if(!result.contains(sb.toString())) result.add(sb.toString());
			return;
		}
		
		
		int a = -1;
		for (int i = 0; i < N; i++) {
			if(nums[i] != a) {
				a = nums[i];
				arr[depth] = nums[i]; 
				recur(depth + 1);
			}
        }
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		sb = new StringBuilder();
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		nums = new int[N];
		arr = new int[M];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(nums);	
		result = new ArrayList<>();
		
		recur(0);
		
//		for(int i=0; i<result.size(); i++) {
//			System.out.println(result.get(i));
//		}
//		
		System.out.println(sb);
	}
}