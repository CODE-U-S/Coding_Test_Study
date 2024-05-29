class Solution {
    public int solution(int a, int b) {
        int simbol = Integer.parseInt( String.valueOf(a) + String.valueOf(b) );
        int calculation = 2*a*b;
        if(simbol > calculation)
            return simbol;
        else
            return calculation;
    }
}
