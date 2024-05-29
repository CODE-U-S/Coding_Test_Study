class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0, j=a;
        for(int i=0; i < included.length; i++, j+=d){
            if(included[i] == true)
                answer += j;
        }
        return answer;
    }
}