import java.util.regex.Pattern;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] bab = { "aya", "ye", "woo", "ma" };
        for (String i : babbling) {
            for (String j : bab)
                i = i.replace(j, ".");
            if (Pattern.matches("^[.]*$", i))
                answer++;
        }
        return answer;
    }
}

class Babbling1 {
    public static void main(String args[]) {
        String[] babbling = { "aya", "yee", "u", "maa", "wyeoo" };
        Solution s = new Solution();
        int result = s.solution(babbling);
        System.out.println(result);
    }
}
