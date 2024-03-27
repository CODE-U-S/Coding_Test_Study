class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int im_so_music[] = new int[200000];
        int cnt = 0;
        for(int i = 0; i < nums.length; i++)
            if(im_so_music[nums[i]-1]++ == 0) 
                cnt++;
        answer = nums.length/2 < cnt ? nums.length/2 : cnt;
        return answer;
    }
}
