import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		String game = st.nextToken();
		int cnt = 0;
		
		Set<String> set = new HashSet<>();
		
		while(N-->0) {
			if(set.add(br.readLine())) {
				cnt++;
			}
		}
		
		switch (game) {
		case "F": {
			cnt = cnt/2;
			break;
		}
		case "O":{
			cnt = cnt/3;
			break;
		}
		default:
			
		}
		System.out.println(cnt);
	}
}