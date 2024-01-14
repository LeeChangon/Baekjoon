import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int[] result = new int[N];
        int cnt = 1;
        int idx = 0;
        int quit = 0;
        
        while(true) {
        	if(quit == N) break;
        	
        	if(arr[idx] > 0) {
        		arr[idx]--;
        		if(arr[idx] == 0) quit++;
        		
        		result[idx] = cnt;
        		idx++;
        		cnt++;
        		
        		
        	} else {
        		idx++;
        	}
        	if(idx == N) idx = 0;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++) {
        	sb.append(result[i]).append(" ");
        }
        System.out.println(sb);
	}	
}
