class Solution {
    public int solution(String binomial) {
        int answer = 0;
        
        String[] arr = binomial.split(" ");
        int a = Integer.parseInt(arr[0]);
        String op = arr[1];
        int b = Integer.parseInt(arr[2]);
        
        if(op.equals("+")) {
            answer = a + b;
        }
        else if(op.equals("-")) {
            answer = a - b;
        }
        else if(op.equals("*")) {
            answer = a * b;
        }
        return answer;
    }
}