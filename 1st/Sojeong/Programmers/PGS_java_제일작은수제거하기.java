package Sojeong.Programmers;

import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        int[] temp = arr.clone();
		Arrays.sort(temp);
		int min = temp[0];
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != min) {
				arrList.add(arr[i]);
			}
		}
		
		int[] answer;	
		if(arrList.size() == 0) {
			answer = new int[1];
			answer[0] = -1;
		} else {
			answer = new int[arrList.size()];
			for (int i = 0; i < arrList.size(); i++) {
				answer[i] = arrList.get(i);
			}
		}
        
        return answer;
    }
}
