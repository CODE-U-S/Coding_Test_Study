class Solution {
    public int[] solution(int[] num_list, int n) {
        int nl = num_list.length, cnt=0;
        int[] answer = new int[(nl%n)!=0? nl/n+1 : nl/n];
        
        for(int i=0; i<nl; i+=n, cnt++)
            answer[cnt] = num_list[i];
        return answer;
    }
}