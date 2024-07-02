class Solution {
    public boolean solution(int x) {
        int sum = 0;
        for(String s : String.valueOf(x).split("")){
            sum += Integer.parseInt(s);
        }
        return x%sum == 0? true : false;
    }
}