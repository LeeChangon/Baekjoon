import java.io.*;
import java.util.*;

public class Main {
	static int N;
	static int M;
	static int[] num;
	static boolean[] visit;
	static List<String> result;
	
	static void recur(int depth) {
		if(depth == M) {
			String s = "";
			for(int i=0; i<M; i++) {
				s += num[i] + " ";	//스트링으로 만들어서 어레이리스트에 넣음
			}
			result.add(s);
			return;
		}
		
		for (int i = 1; i <= N; i++) {
            if(!visit[i]) {			//안 들어간 수
                num[depth] = i;
                
                visit[i] = true;
                recur(depth + 1);
                
                for (int j = i + 1; j <= N; j++) {
                    visit[j] = false;
                }
            }
        }
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		result = new ArrayList<>();
		num = new int[M];
		visit = new boolean[N + 1];
		
		recur(0);
		
		for(int i=0; i<result.size(); i++) {
			System.out.println(result.get(i));
		}
		
	}
}