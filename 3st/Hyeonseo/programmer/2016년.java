class Solution {
    public String solution(int a, int b) {
       String answer = "";
        int i,j;
        int date = 4;
        int day = 30;
        loop:
        for(i = 1; i <= 12; i++){
        	if(i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
            	day = 31;
            }
            else if(i == 2) day = 29;
            else {
            	day = 30;
            }
            
            for(j = 1; j <= day; j++) {
            	if(i == a && j == b) {
            		break loop;
            	}
                date++;
                date %= 7;
                System.out.println(i + "월 " + j + "일");
            }
        }
        switch(date) {
            case 0: answer = "MON";
                break;
            case 1: answer = "TUE";
                break;
            case 2: answer = "WED";
                break;
            case 3: answer = "THU";
                break;
            case 4: answer = "FRI";
                break;
            case 5: answer = "SAT";
                break;
            case 6: answer = "SUN";
                break;
        }
        return answer;
    }
}
//2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요. 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT
//입니다. 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요.
//https://school.programmers.co.kr/learn/courses/30/lessons/12901
//level 0