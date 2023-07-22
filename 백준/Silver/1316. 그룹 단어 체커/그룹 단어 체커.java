import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int cnt=n;

		for(int c=0; c<n; c++) {
			String s = sc.next();
			boolean test[] = new boolean[26];

			for(int i=0; i<s.length()-1; i++) {
				if(s.charAt(i)!=s.charAt(i+1)) {
					if(test[s.charAt(i+1)-97]==true) {
						cnt--;
						break;
					}
				}
				test[s.charAt(i)-97]=true;
			}
		}
		System.out.println(cnt);
	}
}
