class Solution {
    public int solution(int[] num) {
        int answer = 0;
        
        int count = 0;
        for(int i = 0; i < num.length; i++) {
            for(int j = i+1; j < num.length; j++) {
                for(int k = j+1; k < num.length; k++) {
                    int sum = num[i] + num[j] + num[k];
                    for(int a = 1; a < sum+1; a++) {
                        if(sum % a == 0) {
                            count++;
                        }
                    } 
                    if(count == 2) {
                        answer++;
                    }
                    count = 0;
                }
            }
        }
        return answer;
    }
}

