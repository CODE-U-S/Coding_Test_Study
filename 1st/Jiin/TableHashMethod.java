import java.util.*;

class Solution {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        // 최종 리턴 변수
        int answer = 0;
        // 튜플 정렬용 Map
        HashMap<Integer, Integer> index = new HashMap<>();
        for(int i = 0; i < data.length; i++) // HashMap 초기화
            index.put(i + 1, i);
        
        // 튜플 정리
        for(int i = 0; i < data.length; i++){
            int temp;
            for(int j = i+1; j < data.length; j++){
                if(data[index.get(i+1)][col-1] > data[index.get(j+1)][col-1]){
                    temp = index.get(i+1);
                    index.replace(i+1, index.get(j+1));
                    index.replace(j+1, temp);
                }else if(data[index.get(i+1)][col-1] == data[index.get(j+1)][col-1] && 
                         data[index.get(i+1)][0] < data[index.get(j+1)][0]){
                    temp = index.get(i+1);
                    index.replace(i+1, index.get(j+1));
                    index.replace(j+1, temp);
                }
            }
        }
        
        // 나머지 값 더해서 XOR 처리
        for(int i = row_begin; i <= row_end; i++){
            long s_i = 0;
            for(int j = 0; j < data[i-1].length; j++){
                s_i += data[index.get(i)][j] % i;
            }
            answer ^= s_i;
        }
        
        return answer;
    }
}
