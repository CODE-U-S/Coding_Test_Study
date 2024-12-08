class Solution {
    public int solution(int a, int b) {
        int answer = 0 ;
        int num1=0;
        int num2=0;
        String aa="";
        String bb="";
        String a1="";
        String b1="";
        aa=Integer.toString(a); //정수 문자열로 바꾸기
        bb=Integer.toString(b); //정수 문자열로 바꾸기
        a1=aa+bb; //a+b
        b1=bb+aa; //b+a
        num1=Integer.parseInt(a1); //a+b 정수로 바꿔 num1에 넣기
        num2=Integer.parseInt(b1); //b+a 정수로 바꿔 num2에 넣기
        if(num1>num2){
            answer=num1;
        }
        else if(num1<num2){
            answer=num2;
        }
        else answer=num1;
        return answer;
    }
}