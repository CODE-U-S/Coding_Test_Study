class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int o = i; o <= j; o++) {
            String so = String.valueOf(o);
            String sk = String.valueOf(k);
            for (int h = 0; h < so.length(); h++) {
                if(so.charAt(h) == sk.charAt(0)) {
                    answer++;
                }
            }
        }
        return answer;
    }
}