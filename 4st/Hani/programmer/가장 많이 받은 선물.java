import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        
        int[][] present = new int[friends.length][friends.length];
        HashMap<String, Integer> map = new HashMap<>();
        
        // 키: 이름, 값: 인덱스
        for (int i = 0; i < friends.length; i++) {
            map.put(friends[i], i);
        }
        
        // 준 사람 받은 사람 이차원배열에 저장
        for (int j = 0; j < gifts.length; j++) {
            String[] temp = gifts[j].split(" ");
            int from = map.get(temp[0]);
            int to = map.get(temp[1]);
            
            present[from][to]++;
        }
        
        int[] jisoo = new int[friends.length];
        // 선물 지수 계산
        int give = 0; // 준 갯수
        int take = 0; // 받은 갯수
        for (int i = 0; i < present.length; i++) { // 0 1 2 3
            give = 0;
            take = 0;
            for (int j = 0; j < present.length; j++) { // 0 1 2 3
                give += present[i][j]; 
                take += present[j][i]; 
            }
            jisoo[i] = give - take;
        }
        
        int[] nextTake = new int[friends.length]; // 다음달 받을 선물
        for (int i = 0; i < present.length; i++) { // 0 1 2 3
            for (int j = i + 1; j < present.length; j++) { // 0 1 2 3
                // 주고 받은 선물 갯수 비교
                if (present[i][j] > present[j][i]) {
                    nextTake[i]++;
                }
                else if (present[i][j] < present[j][i]) {
                    nextTake[j]++;
                }
                else if (present[i][j] == present[j][i]) {
                    if (jisoo[i] > jisoo[j]) nextTake[i]++;
                    else if (jisoo[i] < jisoo[j]) nextTake[j]++;
                }
                else {
                    jisoo[i] = jisoo[i];
                    jisoo[j] = jisoo[j];
                }
            }
        }
        
        answer = nextTake[0];
        for (int i = 1; i < nextTake.length; i++) {
            if (nextTake[i] > answer) {
                answer = nextTake[i];
            }
        }
        
        
        return answer;
    }
}