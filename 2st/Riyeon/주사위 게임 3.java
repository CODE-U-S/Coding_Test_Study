import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] abcd = {a, b, c, d};
        Arrays.sort(abcd);
        
        if(abcd[0] == abcd[3])
            return 1111*abcd[0];
        else if(abcd[0]==abcd[2] || abcd[1]==abcd[3]){
            int q = abcd[0]==abcd[1]? abcd[3] : abcd[0];
            return (10*abcd[1]+q)*(10*abcd[1]+q);
        }else if(abcd[0]==abcd[1] && abcd[2]==abcd[3])
            return (abcd[0]+abcd[2])*(abcd[0]-abcd[2]<0? -(abcd[0]-abcd[2]):abcd[0]-abcd[2]);
        else if(abcd[0] == abcd[1])
            return abcd[2]*abcd[3];
        else if(abcd[1] == abcd[2])
            return abcd[0]*abcd[3];
        else if(abcd[2] == abcd[3])
            return abcd[0]*abcd[1];
        else
            return abcd[0];

    }
}