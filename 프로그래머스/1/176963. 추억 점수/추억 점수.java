import java.util.*;
import java.io.*;

class Solution {
    public List<Integer> solution(String[] name, int[] yearning, String[][] photo) {
        int arrLength = photo.length;
        List<Integer> answer = new ArrayList<>();
        
        List<String> nameList = Arrays.asList(name);
        
        for(String[] arr : photo) {
            int sum = 0;
            for(String word : arr) {
                int idx = nameList.indexOf(word);
                if(idx != -1) { // 이름이 리스트에 존재하는 경우에만
                    sum += yearning[idx];
                }
            }
            // sum을 String으로 변환하여 리스트에 추가
            answer.add(sum);
        }        
        
        return answer;
    }
}