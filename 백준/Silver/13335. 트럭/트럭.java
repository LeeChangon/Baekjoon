import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken()); //트럭의 수 
        int w = Integer.parseInt(st.nextToken()); //다리 길이
        int L = Integer.parseInt(st.nextToken()); //최대 하중
       
        Queue<Integer> truck = new LinkedList<>();
        Queue<Integer> bridge = new LinkedList<>();
         st = new StringTokenizer(br.readLine());
         
        for(int i=0; i<n; i++) {
            truck.add(Integer.parseInt(st.nextToken()));
        }
        for(int i=0; i<w; i++) {
        	bridge.add(0);
        }

        int cnt = 0;		// 이동 시간 카운트
        int sum = 0;		// 최대 하중 계산

        while(!bridge.isEmpty() || !truck.isEmpty()) {	//
            if(!bridge.isEmpty()) sum -= bridge.poll();
            
            if(!truck.isEmpty()) {
	            if(truck.peek() + sum <= L) {
	                sum += truck.peek();
	                bridge.add(truck.poll());
	            }
	            else {
	            	bridge.add(0);
	            }
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}