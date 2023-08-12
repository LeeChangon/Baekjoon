import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int cnt=1;
		for(int i=0; i<n; i++) {
			for(int j=0; j<cnt; j++) {
				System.out.print("*");
			}
			cnt ++;
			System.out.println();
		}
	}
}