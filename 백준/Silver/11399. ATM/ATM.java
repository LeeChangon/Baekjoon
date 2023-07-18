import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
	       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	       int n = Integer.parseInt(br.readLine());
	       StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	       
	       int[] arr = new int[n];
	       for(int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());
	       
	       Arrays.sort(arr);
	       
	       int result = 0;
	       
	       for(int i=1; i<n; i++) arr[i] = arr[i-1] + arr[i];	   
	       for(int i=0; i<n; i++) result += arr[i];
	       System.out.println(result);
	    }	
}