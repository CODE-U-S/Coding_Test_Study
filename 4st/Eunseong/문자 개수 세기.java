class Solution {
    public int[] solution(String my_string) {
        int answer[] = new int[52];
        for (int i = 0; i < my_string.length(); i++) {
            char temp = my_string.charAt(i);
            if (temp >= 'A' && temp <= 'Z') answer[temp - 'A']++;
            else if (temp >= 'a' && temp <= 'z') answer[temp - 'a' + 26]++;
        }
        return answer;
    }
}