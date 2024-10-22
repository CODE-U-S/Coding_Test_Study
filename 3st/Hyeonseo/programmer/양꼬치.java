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
//level 0 
// 머쓱이네 양꼬치 가게는 10인분을 먹으면 음료수 하나를 서비스로 줍니다. 양꼬치는 1인분에 12,000원, 음료수는 2,000원입니다. 정수 n과 k가 매개변수로 주어졌을 때, 양꼬치 n인분과 음료수 k개를 먹었다면 총얼마를 지불해야 하는지 return 하도록 solution 함수를 완성해보세요.