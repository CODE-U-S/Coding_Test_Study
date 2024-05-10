class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuffer sb = new StringBuffer(Integer.toString(n, 3));
        sb.reverse();
        answer = Integer.parseInt(sb.toString(), 3);

        return answer;
    }
}

class TritFlip {
    public static void main(String[] args) {
        int a = 45;
        Solution s = new Solution();
        int answer = s.solution(a);
        System.out.println(answer); // 정답: 7
    }
}