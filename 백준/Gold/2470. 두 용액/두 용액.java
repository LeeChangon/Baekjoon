import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int i1 = 0;
        int i2 = n-1;
		int a1 = 0;
		int a2 = 0;
        int result = Integer.MAX_VALUE;
        
        while(i1 < i2) {
            int a = arr[i1];
            int b = arr[i2];

            if(Math.abs(a + b) < result ) {
                result = Math.abs(a + b);
                a1 = a;
                a2 = b;
            }
            if(a + b > 0) i2 --;
            else i1 ++;
        }
        System.out.println(a1 + " " + a2);
    }
}