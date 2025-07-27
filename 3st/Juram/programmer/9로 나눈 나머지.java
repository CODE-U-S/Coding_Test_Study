class Solution {
    public int solution(String number) {
        String[] strArr = number.split("");
        int total = 0;
        for(int i=0; i<strArr.length; i++){
            int num = Integer.parseInt(strArr[i]);
            total += num;
        }
        return total % 9;
        
    }
}