class Solution {
    public String solution(String rsp) {
		String answer = "";
		char[] stnum = rsp.toCharArray();
		for(int i = 0; i < stnum.length;i++) {
			if(stnum[i] == '0') {
				answer += "5";
			}
			if(stnum[i] == '2') {
				answer += "0";
			}
			if(stnum[i] == '5') {
				answer += "2";
			}
		}
        return answer;
    }
}