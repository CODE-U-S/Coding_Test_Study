import java.util.*;
class Solution {
    public int solution(int a, int b, int c) {
        Set<Integer> distinct = new HashSet<>(Arrays.asList(a, b, c));
        
        if(distinct.size() == 1)
            return (a + b + c) * (a*a + b*b + c*c) * (a*a*a + b*b*b + c*c*c);
        else if(distinct.size() == 2)
            return (a + b + c) * (a*a + b*b + c*c);
        else
            return a + b + c;
    }
}
