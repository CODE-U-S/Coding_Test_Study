import java.util.*;
class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        int first = sides[2];
        int na = sides[1]+sides[0];
        int answer=0;
        if(first==na) answer=2;
        else if(first>na) answer=2;
        else if(first < na) answer=1;
        return answer;
    }
}