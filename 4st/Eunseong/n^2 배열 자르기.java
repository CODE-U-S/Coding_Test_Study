import java.util.Arrays;

class Solution {
    public int[] solution(int n, long left, long right) {
        // int nSizedArr[][] = new int[n][n];
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j <= i; j++) {
        //         for (int k = 0; k <= i; k++) {
        //             if (nSizedArr[j][k] == 0) nSizedArr[j][k] = i + 1;
        //         }
        //     }
        // }
        // System.out.println(Arrays.deepToString(nSizedArr));
        // return new int[]{};
        
        int answer[] = new int[(int)(right - left + 1)];
        for (int i = 0; i < answer.length; i++) {
            long j = i + left;
            answer[i] = (int)(Math.max(j / n, j % n) + 1l);
        }
        
        return answer;
    }
}

// left / n이 작은배열의 번째를 결정
// left % n이 작은배열에서의 인덱스를 결정
//  