class Solution {
    public String solution(String my_string) {
        my_string = my_string.replaceAll("[aeiou]", "");
        return my_string;
    }
}