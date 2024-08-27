using System;

public class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        int sum = 0;
        Array.Sort(A);
        Array.Sort(B);
        for ( int i = 0, j = A.Length-1 ; i < A.Length ; i++, j-- ) {
            answer += A[i]*B[j];
        }
        return answer;
    }
}