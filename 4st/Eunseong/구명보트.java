import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);

        int i = 0;
        int j = people.length - 1;
        while (i <= j) {
            if (people[i] + people[j] <= limit) {
                answer++;
                i++;
                j--;
            } else {
                answer++;
                j--;
            }
        }
        
        return answer;
    }
}