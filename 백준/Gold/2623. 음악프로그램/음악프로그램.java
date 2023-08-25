import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		List<Integer>[] list = new ArrayList[N + 1];
		Queue<Integer> q = new LinkedList<>();
		
		for(int i=0; i<N+1; i++) {
			list[i] = new ArrayList<>();
		}
		
		int[] ind = new int[N + 1];			//진입차수

		while (M-- > 0) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());

			int a = Integer.parseInt(st.nextToken());
			for (int i = 0; i < num - 1; i++) {
				int b = Integer.parseInt(st.nextToken());
				ind[b]++;
				list[a].add(b);
				a = b;
			}
		}

		for (int i = 1; i < N + 1; i++) {
			if (ind[i] == 0)q.add(i);
		}
		
		int cnt = 0;

		while (!q.isEmpty()) {
			int a = q.poll();
			sb.append(a).append("\n");
			cnt++;
			
			for(int i=0; i<list[a].size(); i++) {
				int b = list[a].get(i);
				ind[b]--;
				if(ind[b] == 0) q.add(b);
			}
		}
		
		if(cnt == N) System.out.println(sb);
		else System.out.println(0);
	}
}