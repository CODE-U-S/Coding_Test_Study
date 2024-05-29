import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        // 숫자들의 이진 표현을 저장할 2차원 배열
        int[][] sum = new int[n][n];
        
        // arr1과 arr2를 이진 문자열로 변환하여 2차원 배열에 저장
        for(int i = 0; i < n; i++){
            String change = String.format("%" + n + "s", Integer.toBinaryString(arr1[i] | arr2[i])).replace(' ', '0');
            // 이진수를 문자열로 변환한 후, 각 문자를 문자열 배열로 변환
            sum[i] = new int[n];
            for (int j = 0; j < n; j++) {
                sum[i][j] = change.charAt(j) - '0';
            }
        }
        
        // 2차원 배열을 반복하여 '1'을 '#'으로, '0'을 ' '으로 대체
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (sum[i][j] == 1) {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            }
            answer[i] = sb.toString();
        }
        
        return answer;
    }
}
