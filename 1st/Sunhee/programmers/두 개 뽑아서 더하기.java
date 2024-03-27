package Sunhee.programmers;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] numbers) {
    	// 결과를 담을 list 선언
        List<Integer> list = new ArrayList<>();

        // 배열 numbers의 모든 두 요소의 합을 구하기 위해 2중 반복문
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
            	// 두 요소의 합이 list에 존재하지 않으면 담기
                if (!list.contains(numbers[i] + numbers[j])) {
                    list.add(numbers[i] + numbers[j]);
                }
            }
        }

        // list를 오름차순 정렬하면서 int 배열로 변환
        return list.stream().sorted().mapToInt(i -> i).toArray();
    }

}