class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        String[] num = Integer.toString(x).split("");
        int sum = 0;
        for (int i = 0; i < num.length; i++)
            sum += Integer.parseInt(num[i]);
        if (x % sum == 0)
            answer = true;
        return answer;
    }
}

class HarshadNumber {
    public static void main(String args[]) {
        int a = 10;
        Solution s = new Solution();
        boolean result = s.solution(a);
        System.out.println(result);
    }
}