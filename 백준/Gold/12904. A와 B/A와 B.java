import java.io.*;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();
		String T = br.readLine();
		
		StringBuffer sb = new StringBuffer();
		sb.append(T);
		
		while(sb.length() != S.length()) {
			int idx = sb.length() - 1;
			if(sb.charAt(idx) == 'A') {
				sb.deleteCharAt(idx);
			}
			else if(sb.charAt(idx) == 'B') {
				sb.deleteCharAt(idx);
				sb.reverse();
			}
		}

		if(sb.toString().equals(S)) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
		
		
	}
}