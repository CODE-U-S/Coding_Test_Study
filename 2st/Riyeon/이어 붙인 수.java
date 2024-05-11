class Solution {
    public int solution(int[] num_list) {
        String a = "", b="";
        for(int i : num_list){
            if(i%2!=0)
                a += String.valueOf(i);
            else
                b += String.valueOf(i);
        }
        return Integer.parseInt(a)+Integer.parseInt(b);
    }
}