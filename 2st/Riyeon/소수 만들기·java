import java.util.*;
class Solution {
    public int solution(int[] nums) {
        List<Integer> li = new ArrayList<>();
        for(int i=0; i<nums.length-2; i++)
            for(int j=i+1; j<nums.length-1; j++)
                for(int k=j+1; k<nums.length; k++)
                    li.add(nums[i] + nums[j] + nums[k]);
        
        int answer = 0;
        for(int i=0; i<li.size(); i++){
            int cnt=0;
            for(int j=2; j<li.get(i); j++)
                    if(li.get(i)%j==0) cnt++;
            if(cnt==0) answer++;
        }                
        return answer;
    }
}