import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
	       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	       StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	       
	       int n, k;
	       n = Integer.parseInt(st.nextToken());
	       k = Integer.parseInt(st.nextToken());
	       
	       int[] coin = new int[n];
	       for(int i=0; i<n; i++) coin[i] = Integer.parseInt(br.readLine());
	       
	       int result = 0;
	       for(int i=n-1; i>=0; i--) {
	    	   if(coin[i] <= k) {
	    		   result += k / coin[i];
	    		   k = k % coin[i];
	    	   }
	       }
	       
	       System.out.println(result);
	    }	
}
