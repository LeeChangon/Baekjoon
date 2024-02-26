class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int i = 0;
        StringBuilder sb = new StringBuilder();
		
		while(i <= t.length()) {
			if(sb.length() == p.length()) {
				if(sb.toString().compareTo(p) <= 0) {
					answer++;
				}
				if(i == t.length()) break;
				else {
					sb.delete(0, 1);
				}
			}
			sb.append(t.charAt(i));
			i++;
			
		}
        
        return answer;
    }
}