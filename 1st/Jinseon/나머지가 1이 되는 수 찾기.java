class Solution {
    public int solution(int n) {
        int i = 0;
        for(i = 1; i < n; i++){
            if( n % i == 1) {
                System.out.print(i + "를 return해야 합니다.");
                break;
            }
        }
        return i;
    }
}
