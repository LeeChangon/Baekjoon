import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int N = Integer.parseInt(br.readLine());
    	
    	String[] arr = new String[N];
    	StringBuilder sb = new StringBuilder();
    	
    	for(int i=0; i<N; i++){
    		arr[i] = br.readLine();
    	}
    	
    	for(int i=0; i<arr[0].length(); i++) {
    		int flag = 0;
    		for(int j=1; j<N; j++) {
    			if(arr[0].charAt(i) != arr[j].charAt(i)) {
    				sb.append("?");
    				flag = 1;
    				break;
    			}
    		}
    		if(flag == 0)
    			sb.append(arr[0].charAt(i));
    	}
    	
    	System.out.println(sb);
    }
    
}