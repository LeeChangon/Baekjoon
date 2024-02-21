import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> map = new HashMap<>();
        
        char[] chars = s.toCharArray();
        
        for(int i=0; i<chars.length; i++) {
        	char c = chars[i];
        	
        	int val = map.getOrDefault(c, -1);
        	
        	if(val == -1) {
        		answer[i] = val;
        	} else {
        		answer[i] = i - val;
        	}

        	map.put(c, i);
        }
        
        return answer;
    }
}