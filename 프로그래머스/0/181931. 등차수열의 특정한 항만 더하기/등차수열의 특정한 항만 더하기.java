class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int n = included.length; 
        int[] result = new int[n]; //등차수열 배열
        result[0] = a;
        
        // 등차수열 넣기
        for (int i = 1; i < result.length; i++) {
            result[i] = result[i-1] + d;
        }
        
        for (int i = 0; i < result.length; i++) {
            if (included[i] == true) {
                answer += result[i];
            }
        }
        return answer;
    }
}