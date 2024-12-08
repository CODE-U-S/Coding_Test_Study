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