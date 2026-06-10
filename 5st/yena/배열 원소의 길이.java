class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
    
        //반복문을 돌면서 인덱스 돌면서 각 원소의 길이
        // 각 원소의 길이를 담을 answer배열 크기와 strlist의 길이가 같으므로 인덱스 i로 공통으로 사용
        for(int i=0; i<=strlist.length-1; i++){
            // i는 인덱스
            // strlist[i] : strlist 배열의 원소(값))
            answer[i] = strlist[i].length();
        }