import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int left = -1; // 왼쪽 2 인덱스
        int right = 0; // 오른쪽 2 인덱스
        
        // 왼쪽에서부터 2찾기
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                left = i;
                break;
            }
        }
        
        // left에 2 존재 시 오른쪽 2도 찾기
        if (left != -1) {
            for(int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] == 2) {
                    right = i;
                    break;
                }
            }
        }
        else {
            return new int[]{-1};
        }
        // left == right 시 [2] 반환
        if (left == right) return new int[]{2};
        
        // left부터 right인덱스까지 배열에 담기 1 5
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            list.add(arr[i]);
        } 
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] += list.get(i);
        }
        return answer; 
    }
}