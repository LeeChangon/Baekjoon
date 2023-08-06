import java.util.*;

public class Solution {
	static HashMap<String, String> id = new HashMap<>();
	
	public String[] solution(String[] record) {
        
        List<String> chatLog = new ArrayList<>();
        
        
        for(int i=0; i<record.length; i++) {
        	String[] s = record[i].split(" ");

        	if(s[0].equals("Enter")) {

        		chatLog.add(s[1] + " Enter");
        		id.put(s[1], s[2]);
        	}
        	else if (s[0].equals("Leave")) {
        		chatLog.add(s[1] + " Leave");
        		
        	}
        	else if(s[0].equals("Change")) {
        		id.put(s[1], s[2]);
        	}
        }
        
        String[] answer = new String[chatLog.size()];
        
        for(int i=0; i<chatLog.size(); i++) {
        	String[] s = chatLog.get(i).split(" ");
        	
        	if(s[1].equals("Enter")) {
//        		System.out.println(id.get(s[0]) + "님이 들어왔습니다.");
        		answer[i] = id.get(s[0]) + "님이 들어왔습니다.";
        		
        	}
        	else if(s[1].equals("Leave")) {
//        		System.out.println(id.get(s[0]) + "님이 나갔습니다.");
        		answer[i] = id.get(s[0]) + "님이 나갔습니다.";
        	} 
        }
        
        
        
        return answer;
    }
	
// 	public static void main(String[] args) {
// 		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		
// 		Main a = new Main();
		
// 		a.solution(record);
// 	}
}