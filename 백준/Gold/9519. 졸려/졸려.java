import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Main {
	static Stack<Character> stack;
	static Queue<Character> q;
	 
	static int find(StringBuilder sb) {
		int cnt = 0;
		String ss = sb.toString();
		
		do {
			sb = shuffle(sb);
			cnt ++;
		} while(!sb.toString().equals(ss));
		
		return cnt;
	}
			 
	static StringBuilder shuffle(StringBuilder sb) {
		stack = new Stack<>();
        q = new LinkedList<>();

		for(int i=0; i<sb.length(); i+=2) q.add(sb.charAt(i));
		for(int i=1; i<sb.length(); i+=2) stack.add(sb.charAt(i));
			
		sb = new StringBuilder();
		while(!q.isEmpty()) sb.append(q.poll());
	
		while(!stack.isEmpty()) sb.append(stack.pop());
        
		return sb;
		
	}
	public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder(br.readLine());
        
//        int a = find(sb);
//        if(n > a)
//        	n = n - (a % n);
        n = n % find(sb);
        for(int i=0; i<n; i++) {
        	sb = shuffle(sb);
        }
        
//        System.out.println(n);
        System.out.println(sb);
	}
}