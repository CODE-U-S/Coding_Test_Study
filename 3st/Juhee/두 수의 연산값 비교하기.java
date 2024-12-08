class Solution {
    public int solution(int a, int b) {
        int concatValue = Integer.parseInt("" + a + b);
        int productValue = 2 * a * b;
        if (concatValue > productValue) {
            return concatValue;
        } 
        else {
            return productValue;
        }
    }
}
