import java.util.*;
class Solution {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> li = new ArrayList<>();
        li.add(n);
        while(n!=1){
            if(n%2==0) n /= 2;
            else n = 3*n+1;
            li.add(n);
        }
        return li;
    }
}