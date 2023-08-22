import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	static String arr;
	static int len;
	static boolean visit[];
	
	static void recur(int idx, String s) {
		if(idx == arr.length() ) {
			for (int i = 1; i <= len; i++) {
				if(!visit[i])
					return;
			}
			System.out.println(s.trim());
			System.exit(0);
			return;
		}
		
		String tmp = arr.substring(idx, idx+1);
		int num = Integer.parseInt(tmp);
		
		if(!visit[num]) {
			visit[num] = true;
			recur(idx + 1, s + " " + tmp);
			visit[num] = false;
		}
		
		if(idx < arr.length() - 1) {
			tmp = arr.substring(idx, idx+2);
			num = Integer.parseInt(tmp);
			if(num <= len && !visit[num]) {
				visit[num] = true;
				recur(idx + 2, s + " " + tmp);
				visit[num] = false;
			}
		}	
	}
	
	public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arr = br.readLine();
        
        if(arr.length() > 9) len = 9 + ((arr.length() - 9) / 2);
        else len = arr.length();
        visit = new boolean[len + 1];
        
        recur(0, "");
	}
}