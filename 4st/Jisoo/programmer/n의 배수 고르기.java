class Solution {
    public int[] solution(int n, int[] numlist) {
        int a=0;
        for(int i=0;i<numlist.length;i++){
            if(numlist[i]%n==0){
                a++;
            }
        }
        int [] answer=new int[a];
        int k=0;
        for(int i=0;i<numlist.length;i++){
            if(numlist[i]%n==0){
                answer[k]=numlist[i];
                k++;
            }
        }
        return answer;
    }
}