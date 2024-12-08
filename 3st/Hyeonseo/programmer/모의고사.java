import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        List<Integer> test = new ArrayList<>();
        int[] last= new int[3];
        //참가자들
        int[] one={1,2,3,4,5};
        int[] two={2,1,2,3,2,4,2,5};
        int[] thr={3,3,1,1,2,2,4,4,5,5};
        // 세팅 종료

        //맞춘 개수 세팅
        for(int i=0;i<answers.length;i++){
            if(answers[i]==one[i%one.length]) {
                last[0]++;
            }
            if(answers[i]==two[i%two.length]) {
                last[1]++;
            }
            if(answers[i]==thr[i%thr.length]) {
                last[2]++;
            }
        }

        //최대값 세팅
        int max=0;
        for(int i:last) {
            max=Math.max(i,max);
        }

        //최대로 맞춘 사람 정리
        for(int i=0;i<3;i++){
            if(last[i]==max){
                test.add(i+1);
            }
        }
        int size= test.size();
        int[] answer=new int[size];
        for(int i=0;i<size;i++) {
            answer[i]=test.get(i);
        }
        return answer;
    }
}

