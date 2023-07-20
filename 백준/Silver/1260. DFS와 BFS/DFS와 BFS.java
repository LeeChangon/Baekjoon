import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int[][] graph;
	static boolean[] visit;
	
	public static void dfs(int a) {
		System.out.printf("%d ", a);
		visit[a] = true;
		
		if(a == graph.length) return;
		
		for(int i = 1 ; i<graph.length ; i++) {
			if(graph[a][i] == 1 && visit[i] == false)
				dfs(i);
		}
	}
	
	public static void bfs(int a) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(a);
		visit[a] = true;
		
		System.out.printf("%d ", a);
		
		while(!q.isEmpty()) {
			int n = q.poll();
			
			for(int i=1; i<graph.length; i++) {
				if(graph[n][i] == 1 && visit[i] == false) {
					visit[i] = true;
					System.out.printf("%d ", i);
					q.add(i);
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int v = sc.nextInt();
        
        graph = new int[n+1][n+1];
        
        for(int i=0 ; i < m ; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            graph[a][b] = 1;
            graph[b][a] = 1;
        }
        
        visit = new boolean[n + 1];
        dfs(v);
        System.out.println();
        
        visit = new boolean[n + 1];
        bfs(v);
        
 
	}	
}