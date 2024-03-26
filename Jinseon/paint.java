class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        //start와 end를 정해준다.
        int start = section[0], end = section[0] + (m-1);
        for(int i: section){
             //안에 있으면 skip, 없으면 restart
            if(!(i >= start && i <= end)){
                start = i;
                end = i + (m - 1);
                answer++;
            }
        }
        return answer;
    }
}