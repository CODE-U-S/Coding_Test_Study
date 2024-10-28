class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<t*m; i++){
            String s = Integer.toString(i, n);
            s = s.toUpperCase();
            sb.append(s);
        }
        
        StringBuilder answer = new StringBuilder();
        int num = p-1;
        while(answer.length() != t){
            answer.append(sb.charAt(num));
            num += m;
        }
        return answer.toString();
    }
}