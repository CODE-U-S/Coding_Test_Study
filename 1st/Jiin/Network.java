import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        Stack<Integer> network = new Stack<Integer>();
        boolean[] searchOK = new boolean[n];
        boolean limit = true;
        int answer = 0, i = 0, j = 0, start = 0;
        
        do{
            //DFS
            searchOK[start] = true;
            do{
                for(j = 0; j < n; j++){
                    if(i!=j && computers[i][j]==1 && !searchOK[j]){
                        network.push(i);
                        searchOK[j] = true;
                        i = j;
                        break;
                    }//if
                }//for
                if(j >= n && i != start) i = network.pop();
            }while(i != start);
            answer++;
            
            // 모든 그래프를 탐색하였는가
            limit = false;
            for(i = 0; i < n; i++){
                if(!searchOK[i]){
                    start = i;
                    limit = true;
                    break;
                }
            }
        }while(limit);
        
        return answer;
    }
}
