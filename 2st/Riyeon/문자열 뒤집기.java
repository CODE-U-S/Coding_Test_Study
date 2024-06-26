class Solution {
    public StringBuffer solution(String my_string, int s, int e) {
        StringBuffer sb = new StringBuffer(my_string.substring(s,e+1));
        sb.reverse();
        sb.insert(0, my_string.substring(0, s));
        sb.append(my_string.substring(e+1));
            
        return sb;
    }
}