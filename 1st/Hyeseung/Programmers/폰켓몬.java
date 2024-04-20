import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        for(int num : nums) hash.add(num);
        return hash.size() > nums.length / 2 ? nums.length / 2 : hash.size();
    }
}