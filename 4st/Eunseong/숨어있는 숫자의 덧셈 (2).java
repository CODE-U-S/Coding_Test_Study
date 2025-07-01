class Solution {
    public int solution(String my_string) {
        int sum = 0;
        my_string = my_string.replaceAll("[a-zA-Z]", " ");
        String str[] = my_string.split(" ");
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("")) continue;
            else sum += Integer.valueOf(str[i]);
        }
        return sum;
    }
}