import java.util.*;
import java.io.*;

class Main {
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static int N, M;
	static int[][] map, visit;
	static Node start;
	
	static void bfs() {
		Queue<Node> q = new ArrayDeque<>();
		q.add(start);
		
		while(!q.isEmpty()) {
			Node now = q.poll();
			int nowVal = visit[now.x][now.y];
			
			for(int i=0; i<4; i++) {
				int nx = now.x + dx[i];
				int ny = now.y + dy[i];
				
				if(nx >= 0 && nx < N && ny >= 0 && ny < M && visit[nx][ny] != 0) {
					if(visit[nx][ny] == -1 ||  visit[nx][ny] > nowVal + 1) {
						visit[nx][ny] = nowVal + 1;
						q.add(new Node(nx, ny));
					}
				}
			}
		}
	}
	
	static class Node {
		int x, y;

		public Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        map = new int[N][M];
        visit = new int[N][M];
        
        for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			Arrays.fill(visit[i], -1);
			
			for(int j=0; j<M; j++) {
				int num = Integer.parseInt(st.nextToken());
				
				if(num == 2) {
					start = new Node(i, j);
					visit[i][j] = 0;
				} 
				else if(num == 0) {
					visit[i][j] = 0;
				}
				
				map[i][j] = num;
			}
		}
        
        bfs();
        
        
        for(int i=0; i<N; i++) {
        	for(int j=0; j<M; j++) {
        		sb.append(visit[i][j]).append(" ");
        	}
        	sb.append("\n");
        }
        System.out.println(sb);
    }
}