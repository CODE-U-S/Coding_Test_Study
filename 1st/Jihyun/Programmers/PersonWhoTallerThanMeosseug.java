class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i] > height)
                answer++;
        return answer;
    }
}

class PersonWhoTallerThanMeosseug {
    public static void main(String args[]) {
        int[] a = { 149, 180, 192, 170 };
        int b = 167;
        Solution s = new Solution();
        int answer = s.solution(a, b);
        System.out.println(answer);    // 3
    }
}