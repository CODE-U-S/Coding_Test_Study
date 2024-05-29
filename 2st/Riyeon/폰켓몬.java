import java.util.*;
class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i : nums)
            hs.add(i);
        return nums.length/2 > hs.size()? hs.size() : nums.length/2;
    }
}