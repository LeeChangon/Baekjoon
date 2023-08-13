import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int maxV = 0;
		int result = 0;
		
		for(int i=1; i<=9; i++) {
			int a = sc.nextInt();
			if(a > maxV) {
				maxV = a;
				result = i;
			}
			
		}
		System.out.println(maxV);
		System.out.println(result);
	}
}