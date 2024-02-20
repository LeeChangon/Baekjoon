import java.util.*;
import java.io.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        int now = -1;
        
        for(int i=0; i<section.length; i++) {
            if(section[i] > now) {
                now =  section[i] + m - 1;
                answer++;
            }
        }
        
        return answer;
    }
}