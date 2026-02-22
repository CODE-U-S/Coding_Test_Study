class Solution {
    public int solution(int n, String control) {
        int answer = n;
        String[] controlList = control.split("");
        for(int i = 0; i<controlList.length; i++){
            if(controlList[i].equals("w")){
                answer+=1;
            }
            else if(controlList[i].equals("s")){
                answer-=1;
            }
            else if(controlList[i].equals("d")){
                answer+=10;
            }
            else if(controlList[i].equals("a")){
                answer-=10;
            }
        }
        return answer;
    }
}
