class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean[] number = new boolean[10];
        for (int i = 0; i < numbers.length; i++)
            number[numbers[i]] = true;

        for (int i = 0; i < number.length; i++)
            if (number[i] == false)
                answer += i;

        return answer;
    }
}

class AddMissingNumber {
    public static void main(String args[]) {
        int[] a = { 1, 2, 3, 4, 6, 7, 8, 0 };
        Solution s = new Solution();
        int result = s.solution(a);
        System.out.println(result);
    }
}