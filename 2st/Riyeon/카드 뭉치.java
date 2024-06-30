class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int c1=0, c2=0;
        for(String s : goal){
            if(c1<cards1.length && s.equals(cards1[c1]))
                c1++;
            else if(c2<cards2.length && s.equals(cards2[c2]))
                c2++;
            else
                return "No";
        }
        return "Yes";
    }
}