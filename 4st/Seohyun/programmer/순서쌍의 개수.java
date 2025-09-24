class Solution {
    public int solution(int n) {
        int answer = 0;
<<<<<<< HEAD:4st/Jisoo/programmer/순서쌍의 개수.java
        for(int i=1;i<=n;i++){
            if(n%i==0){
              answer++;  
            }
<<<<<<< HEAD
=======
                
>>>>>>> 87bb6c70 ([PGS] 문자열 정렬하기 (1) / Level.0)
=======
        for(int i=1; i<=n; i++ ) {
            if(n%i==0) answer++;
>>>>>>> 2556da0d1159d7f840132e97726dc7731cbe2188:4st/Seohyun/programmer/순서쌍의 개수.java
        }
        return answer;
    }
}