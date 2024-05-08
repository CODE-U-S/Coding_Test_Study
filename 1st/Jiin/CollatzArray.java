import java.util.ArrayList;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> dy_arr = new ArrayList<Integer> ();
        dy_arr.add(n);
        do{
            if(n%2 == 0){
                n /= 2;
                dy_arr.add(n);
            }else{
                n = n*3+1;
                dy_arr.add(n);
            }
        }while(n != 1);
        int tmp = 0;
        answer = new int[dy_arr.size()];
        for(int num: dy_arr)
            answer[tmp++] = num;
        return answer;
    }
}