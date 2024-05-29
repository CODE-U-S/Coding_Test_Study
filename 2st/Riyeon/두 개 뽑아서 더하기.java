import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> li = new ArrayList<>();
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                int n = numbers[i] + numbers[j];
                int cnt = 0;
                for(int k=0; k<li.size(); k++){
                    if(li.get(k) == n)
                        cnt++;
                }
                if(cnt == 0)
                    li.add(n);
            }
        }
        Collections.sort(li);
        
        return li.stream().mapToInt(i->i).toArray();
    }
}