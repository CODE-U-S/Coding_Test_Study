class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right-left)+1];   
        int idx = 0;
        for(long i=left; i<=right; i++){
            long first = i / n + 1;
            long last = i % n;
            if(first > last)
                answer[idx++] = (int)first;
            else
                answer[idx++] = (int)(last + 1);
        }
        return answer;
    }
}