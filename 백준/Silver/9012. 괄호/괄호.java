import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int t = Integer.parseInt(br.readLine());
        
        for(int tc=0; tc<t; tc++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	String s = st.nextToken();
        	//System.out.println(s);
        	int cnt = 0;
        	for(int i=0; i<s.length(); i++) {
        		if (s.charAt(i) == '(') cnt+= 1;
        		else if (s.charAt(i) == ')') cnt-= 1;
        		if (cnt < 0) break;
        	}
        	if (cnt == 0) System.out.println("YES");
        	else System.out.println("NO");
        }
    }

}