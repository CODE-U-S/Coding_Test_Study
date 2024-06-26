import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int n = numbers.length;
        int[] answer = new int[n*n];
        int index = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i != j) answer[index++] = numbers[i] + numbers[j];
            }
        }
        int zero = 0;
        for(int i = 0; i < n; i++){
            if(numbers[i] == 0){
                zero++;
            }
        }
        if(zero >= 2){
            answer = Arrays.stream(answer)
                        .distinct()
                        .toArray();   
        } else {
                answer = Arrays.stream(answer)
                        .distinct()
                         .filter(num -> num != 0)
                        .toArray();
        }
        Arrays.sort(answer);
        return answer;
    }
}
