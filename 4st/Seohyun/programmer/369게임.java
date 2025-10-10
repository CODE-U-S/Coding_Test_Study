class Solution {
    public int solution(int order) {
        String num=Integer.toString(order);
        int answer = 0;
        
        char[] numArray = num.toCharArray();
        for (int i=0; i<numArray.length; i++) {
            if (numArray[i]=='3' || numArray[i]=='6' || numArray[i]=='9')
                answer++;
        }
        
        return answer;
    }
}