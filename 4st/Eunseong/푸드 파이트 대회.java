class Solution {
    public String solution(int[] food) {
        StringBuilder s = new StringBuilder();
        
        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i] / 2; j++) {
                s.append(Integer.toString(i));
            }
        }
        
        StringBuilder answer = new StringBuilder(s);
        s.reverse();
        return answer.append(0).append(s).toString();
    }
}