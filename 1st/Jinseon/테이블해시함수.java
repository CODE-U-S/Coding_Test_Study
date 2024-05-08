import java.util.Arrays;

class Solution {	
	
// 1. 주어진 2차원 배열 data를 특정 열을 기준으로 정렬
// 2. 일정 범위의 행에서 나머지의 합을 구하여 누적 XOR 값을 반환하기
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;
        
        // 1. 배열 data를 주어진 열 col을 기준으로 정렬
        Arrays.sort(data, (o1, o2) -> {
            if (o1[col - 1] == o2[col - 1]) { // 만약 두 행의 col 열 값이 같으면
                // 첫 번째 열의 값을 기준으로 내림차순으로 정렬
                return Integer.compare(o2[0], o1[0]);
            }
            // col 열 값을 기준으로 오름차순으로 정렬
            return o1[col - 1] - o2[col - 1];
        });
        
        // 2. 특정 범위의 행에서 나머지의 합을 구하여 누적 XOR 연산을 수행
        for (int i = row_begin - 1; i < row_end; i++) { // row_begin에서 row_end 범위의 행을 순회
            int sum = 0;
            // 나머지를 구하고 sum에 누적
            for (int j = 0; j < data[0].length; j++) {
                sum += data[i][j] % (i + 1);  // 각 열 값을 나눈 나머지 더하기
            }
            // 누적 XOR 연산
            answer ^= sum;
        }
        return answer;
    }
}
