class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        int count[] = new int[1000];
        for (int num : array) {
            count[num]++;
        }
        int maxCount = 0;
        for (int c : count) {
            if (c > maxCount)
                maxCount = c;
        }
        int maxNums = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] == maxCount) {
                answer = i;
                maxNums++;
            }
        }
        if (maxNums > 1)
            answer = -1;
        
        return answer;
    }
}