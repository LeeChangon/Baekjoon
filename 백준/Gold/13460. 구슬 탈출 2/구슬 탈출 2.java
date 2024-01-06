import java.io.*;
import java.util.*;

class Main{
	static int[] dx = {1, 0, -1, 0}; //하 우 상 좌
	static int[] dy = {0, 1, 0, -1}; //0 1 2 3
	static int N, M, result;
	static char[][] map;

	static class Bead{
		int x, y;
		
		public Bead(int x, int y) {
			this.x = x;
			this.y = y;
		}
		@Override
		public String toString() {
			return "Bead [x=" + x + ", y=" + y + "]";
		}	
	}
	
	static Bead[] move(int dir, Bead red, Bead blue) {
		Bead r = new Bead(red.x, red.y);
		Bead b = new Bead(blue.x, blue.y);

	    if ((dir == 0 && r.x >= b.x) || (dir == 1 && r.y >= b.y) || (dir == 2 && r.x <= b.x) || (dir == 3 && r.y <= b.y)) {
	        while(true) {
	        	int nx = r.x + dx[dir];
	        	int ny = r.y + dy[dir];
	        	
	        	if(nx >= 1 && nx < N-1 && ny >= 1 && ny < M-1) {
	        		if(map[nx][ny] == '.') {
		        		r.x = nx;
		        		r.y = ny;
	        		}
	        		else if(map[nx][ny] == 'O') {
		        		r.x = -1;
		        		r.y = -1;
		        		break;
		        	} else {
		        		break;
		        	}
	        	} else {
	        		break;
	        	}
	        }
	        
	        while(true) {
	        	int nx = b.x + dx[dir];
	        	int ny = b.y + dy[dir];
	        	
	        	if(nx == r.x && ny == r.y) break;
	        	if(nx >= 1 && nx < N-1 && ny >= 1 && ny < M-1) {
	        		if(map[nx][ny] == '.') {
		        		b.x = nx;
		        		b.y = ny;
	        		}
	        		else if(map[nx][ny] == 'O') {
		        		b.x = -1;
		        		b.y = -1;
		        		break;
		        	} else {
		        		break;
		        	}
	        	} else {
	        		break;
	        	}
	        }

	    } else {
	    	 while(true) {
		        	int nx = b.x + dx[dir];
		        	int ny = b.y + dy[dir];
		        	
		        	if(nx >= 1 && nx < N-1 && ny >= 1 && ny < M-1) {
		        		if(map[nx][ny] == '.') {
			        		b.x = nx;
			        		b.y = ny;
		        		}
		        		else if(map[nx][ny] == 'O') {
			        		b.x = -1;
			        		b.y = -1;
			        		break;
			        	} else {
			        		break;
			        	}
		        	} else {
		        		break;
		        	}
		        }
		        
		        while(true) {
		        	int nx = r.x + dx[dir];
		        	int ny = r.y + dy[dir];
		        	
		        	if(nx == b.x && ny == b.y) break;
		        	if(nx >= 1 && nx < N-1 && ny >= 1 && ny < M-1) {
		        		if(map[nx][ny] == '.') {
			        		r.x = nx;
			        		r.y = ny;
		        		}
		        		else if(map[nx][ny] == 'O') {
			        		r.x = -1;
			        		r.y = -1;
			        		break;
			        	} else {
			        		break;
			        	}
		        	} else {
		        		break;
		        	}
		        }
	    }
		Bead[] beads = {r, b};
		return beads;
	}
	
	static void dfs(Bead red, Bead blue, int depth, int lastDir) {
		if(depth > 10 || depth >= result) return;
		
		for(int i=0; i<4; i++) {
			if(i == lastDir) continue;
			Bead[] beads = move(i, red, blue);

			if(beads[0].equals(red) && beads[1].equals(blue)) continue;
			else if(beads[1].x == -1 ) continue;
			else if(beads[0].x == -1) {
				result = Math.min(depth, result);
				continue;
			}
			else {
				dfs(beads[0], beads[1], depth + 1, i);
			}
		}
	}
	
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new char[N][M];
		result = Integer.MAX_VALUE;
		
		int rx = 0;
		int ry = 0;
		int bx = 0;
		int by = 0;
		
		for(int i=0; i<N; i++) {
			String line = br.readLine();
			map[i] = line.toCharArray();
			
			if(line.contains("R") || line.contains("B")) {
				for(int j=0; j<M; j++) {
					if(map[i][j] == 'R') {
						rx = i; ry = j;
						map[i][j] = '.';
					}
					else if(map[i][j] == 'B') {
						bx = i; by = j;
						map[i][j] = '.';
					}
				}
			}
	
		}
		
		Bead red = new Bead(rx, ry);
		Bead blue = new Bead(bx, by);
		
		dfs(red, blue, 1, -1);
		
		if(result == Integer.MAX_VALUE) result = -1;
		System.out.println(result);

	}
}