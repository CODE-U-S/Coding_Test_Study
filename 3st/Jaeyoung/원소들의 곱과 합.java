class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int multiple=1;
        int sum=0;
        int sumsum;
        for(int i=0; i<num_list.length; i++){
            multiple*=num_list[i];
            sum+=num_list[i];
        }
        sumsum=sum*sum;
        if(multiple>sumsum) answer=0;
        else if(multiple<sumsum) answer=1;
        return answer;
    }
}