class Solution {
    public int[] solution(int n, String[] words) {
		int index = 0;
		int answer[] = new int[2];
		int min = words.length;
		int count = 0;
		for(int i = 0; i < words.length-1; i++) {
			if(count == 0 && words[i].charAt(words[i].length()-1) != words[i+1].charAt(0)) {
				index = i+2;	
				break;
			}
			for(int j = i+1; j < words.length; j++) {
				if(words[i].equals(words[j])) {
					index = j+1;
					min = Math.min(min, index);
					count++;
					index = min;
				}
			}
		}
		answer[0] = index%n;
		if(index != 0 && index % n == 0) {
			answer[0] = n;
		}
		answer[1] = (int)Math.ceil((double)index/n);
        return answer;
    }
}

//level 2