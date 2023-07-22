import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		s = s.replaceAll("dz=", "q");
		s = s.replaceAll("s=", "q");
		s = s.replaceAll("c=", "q");
		s = s.replaceAll("nj", "q");
		s = s.replaceAll("lj", "q");
		s = s.replaceAll("z=", "q");
		s = s.replaceAll("d-", "q");
		s = s.replaceAll("c-", "q");
		
		System.out.println(s.length());
	}
}
