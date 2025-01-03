class Solution {
    public int solution(String[] spell, String[] dic) {
        boolean a = false;
        for (String word : dic) {
            int count = 0;
            for (String s : spell) {
                if (word.contains(s)) count++;
            }
            if (count == spell.length) {
                a = true;
                break;
            }
        }
        return a ? 1 : 2;
    }
}
