class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String astr = String.valueOf(a);
        String bstr = String.valueOf(b);
        
        String ab = astr + bstr;
        String ba = bstr + astr;
        
        int abInt = Integer.parseInt(ab);
        int baInt = Integer.parseInt(ba);
        
        if (abInt > baInt || abInt == baInt) {
            answer = abInt;
        }
        else if (abInt < baInt) {
            answer = baInt;
        }
        
        
        return answer;
    }
}