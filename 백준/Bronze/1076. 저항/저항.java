import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        int[][] arr = {{0, 1}, {1, 10}, {2, 100}, {3, 1000}, {4, 10000}, {5, 100000},
        		{6, 1000000}, {7, 10000000}, {8, 100000000}, {9, 1000000000}};
        Map<String, Integer> map = new HashMap<>();
        map.put("black", 0);
        map.put("brown", 1);
        map.put("red", 2);
        map.put("orange", 3);
        map.put("yellow", 4);
        map.put("green", 5);
        map.put("blue", 6);
        map.put("violet", 7);
        map.put("grey", 8);
        map.put("white", 9);
        
        long result = 0;
        String line = br.readLine();
        result += arr[map.get(line)][0] * 10;
        
        line = br.readLine();
        result += arr[map.get(line)][0];
        
        line = br.readLine();
        result *= arr[map.get(line)][1];
        
        System.out.println(result);
    }
}