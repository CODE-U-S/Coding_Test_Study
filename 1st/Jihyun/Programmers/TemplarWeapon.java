class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] m = new int[number];

        for(int i = 1; i <= number; i++) {
            int cnt = 0;
            for(int j = 1; j * j <= i; j++) {
                if(j * j % i == 0)
                    cnt++;
                else if(i % j == 0)
                    cnt += 2;
            }
            m[i - 1] = cnt;
        }

        for(int i = 0; i < m.length; i++)
            if(m[i] > limit)
                m[i] = power;

        for(int i = 0; i < m.length; i++)
            answer += m[i];

        return answer;
    }
}

public class TemplarWeapon {
    public static void main(String args[]) {
        Solution s = new Solution();
        System.out.println(s.solution(5, 3, 2));  // 10
    }
}