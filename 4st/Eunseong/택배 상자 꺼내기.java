class Solution {
    public int solution(int n, int w, int num) {
        boolean isEvenRow = ((int)Math.ceil(num / w) + 1) % 2 == 0;
        int col = num % w;
        if (isEvenRow) {
            if (col == 0) col = 1;
            else {
                col = w + 1 - col;
            }
        } else {
            if (col == 0) col = w;
        }
        
        int answer = 1;
        int i = num;
        int plus = 1 + 2 * (col - 1);
        while (true) {
            System.out.println(i);
            if (isEvenRow) {
                i += plus;
            } else {
                i += w * 2 - plus;
            }
            isEvenRow = !isEvenRow;
            
            if (i > n) break;
            answer++;
        }
        
        return answer;
    }
}