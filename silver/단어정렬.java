import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 단어의 개수 N 입력 받기
        int N = sc.nextInt();
        sc.nextLine(); // 개행 문자 처리
        
        // 단어들을 저장할 Set 생성 (중복 제거)
        Set<String> wordSet = new HashSet<>();
        
        // 단어 입력 받기
        for (int i = 0; i < N; i++) {
            wordSet.add(sc.nextLine().trim());
        }
        
        // List로 변환 후 정렬
        List<String> wordList = new ArrayList<>(wordSet);
        wordList.sort((a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b); // 길이가 같으면 사전 순 정렬
            } else {
                return Integer.compare(a.length(), b.length()); // 길이 순 정렬
            }
        });
        
        // 결과 출력
        for (String word : wordList) {
            System.out.println(word);
        }
        
        sc.close();
    }
}