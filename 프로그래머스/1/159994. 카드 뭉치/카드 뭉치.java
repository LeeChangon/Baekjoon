import java.util.*;
import java.io.*;

class Solution {
	    public String solution(String[] cards1, String[] cards2, String[] goal) {
	        Queue<String> q1 = new ArrayDeque<String>();
	        Queue<String> q2 = new ArrayDeque<String>();
	        
	        q1.addAll(Arrays.asList(cards1));
	        q2.addAll(Arrays.asList(cards2));
	        
	        for(int i=0; i<goal.length; i++) {
	        	String word = goal[i];
	        	if(!q1.isEmpty() && q1.peek().equals(word)) {
	        		q1.poll();
	        	} else if(!q2.isEmpty() && q2.peek().equals(word)) {
	        		q2.poll();
	        	} else {
	        		return "No";
	        	}
	        }
	        
	        return "Yes";
	    }    
        
}
