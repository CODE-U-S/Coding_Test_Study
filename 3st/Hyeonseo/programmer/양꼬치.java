class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int ser = n / 10;
        
        int drink = k * 2000;
        int sheep = n * 12000;
        if(n > 0) {
            answer = (drink-(ser*2000)) + sheep;
        }
        return answer;
    }
}
