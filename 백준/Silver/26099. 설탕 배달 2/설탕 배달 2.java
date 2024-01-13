import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long N = Long.parseLong(br.readLine());
        long result = 0L;
        
        while(true) {
        	if(N % 5 == 0) {
        		result += N/5;
        		break;
        	}
        	else if(N < 0) {
        		result = -1;
        		break;
        	}
        	N -= 3;
        	result ++;        	      		
        }
        System.out.println(result);
	}	
}
