
import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		//priorityqueue를 선언하고 인터페이스 comparator의 compare 메소드를 오버라이드
		Queue<Integer> q = new PriorityQueue<>();
		
		while(N-->0) {	//잡기술
			int num= Integer.parseInt(br.readLine());
			if(num == 0) {
				if(q.isEmpty()) {
					System.out.println(0);
				}
				else {
					System.out.println(q.poll());
				}
			}
			else {
				q.add(num);
			}
		}
		
	}
}