class Solution {
    boolean prime(long l){
        if(l == 1) return false;
        for(int i=2; i<=Math.sqrt(l); i++)
            if (l % i == 0) return false;
        return true;
    }
    public int solution(int n, int k) {
        int answer = 0;
        String str = Integer.toString(n, k);
        for(String s : str.split("0")){
            if(!s.isEmpty()){
                if(prime(Long.parseLong(s, 10)))
                    answer++;
            }
        }
        return answer;
    }
}