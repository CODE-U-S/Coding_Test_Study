// import java.util.Arrays;

class Solution {
    public int solution(int[] a) {
        int[] leftMinArr = new int[a.length];   // 왼쪽 최솟값배열
        int[] rightMinArr = new int[a.length];  // 오른쪽 최솟값배열
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            min = Math.min(min, a[i]);
            leftMinArr[i] = min;
        }
        min = Integer.MAX_VALUE;
        for (int i = a.length - 1; i >= 0; i--) {
            min = Math.min(min, a[i]);
            rightMinArr[i] = min;
        }
        
        // System.out.println(Arrays.toString(leftMinArr));        
        // System.out.println(Arrays.toString(rightMinArr));        
        // [2, 1, 3, 4] -> [2, 2, 1, 1], [1, 3, 4, 4] 
        
        int answer = 0;
        for (int i = 0; i < a.length; i++) {
            if (i == 0 || i == a.length - 1) {
                answer++;
            } else {
                if (leftMinArr[i] < a[i] && rightMinArr[i] < a[i]) {
                    continue;
                }
                answer++;
            }
        }
       
        return answer;
    }
}

// 큰거 여러번 작은거 한번
// 좌 / 우 최솟값 저장해놓고 하면 ?