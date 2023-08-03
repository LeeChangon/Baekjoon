import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); //후보 수
        int M = Integer.parseInt(br.readLine()); //총 추천 수

        int[] student = new int[101]; //최대 100명

        List<Integer> nomi = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++) { //System.out.println(i);
            int a = Integer.parseInt(st.nextToken());
            student[a]++;        //투표 받은 학생 +1


            if(!nomi.contains(a) && nomi.size() < N) {    //후보가 안찼고 후보에 없을 때
                nomi.add(a);
            }
            else if(!nomi.contains(a) && nomi.size() >= N) { //후보가 다 찼을 때
                int min = Integer.MAX_VALUE;

                for(int j : nomi) {
                	min = Math.min(student[j], min);
                    
                }
//                System.out.println(a);
//                for(int j=0; j<nomi.size(); j++) System.out.print(nomi.get(j) + " ");
//                System.out.println();
//                for(int j=0; j<nomi.size(); j++) System.out.print(student[nomi.get(j)] + " ");
//                System.out.println();
                
                for(int j=0; j<nomi.size(); j++) {
                    if(student[nomi.get(j)] == min) {
//                        System.out.println(nomi.get(j));

                        student[nomi.get(j)] = 0; 
                        nomi.remove(j);
                        nomi.add(a);
                        break;
                    }
                }
            }


        }
        Collections.sort(nomi);
        for(int s : nomi) {
            System.out.print(s + " ");
        }
    }
}