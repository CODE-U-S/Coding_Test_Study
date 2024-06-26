class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        if(n == num_list.length) n=0;
        
        for(int i=0; i<num_list.length; i++, n++){    
            answer[i] = num_list[n];
            if(n == num_list.length-1)
                n=-1;
        }
        return answer;
    }
}