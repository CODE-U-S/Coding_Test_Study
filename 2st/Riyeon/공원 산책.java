class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];;
        // S의 위치
        for(int i=0; i<park.length; i++){
            for(int j=0; j<park[i].length(); j++)
                if(park[i].charAt(j) == 'S'){
                    answer[0]=i;
                    answer[1]=j;
                    break;
                }
        }
        
        // 이동
        for(String s : routes){
            String[] str = s.split(" ");
            int n = Integer.parseInt(str[1]);
            switch(str[0]){
                case "E":
                    if(answer[1]+n < park[0].length() && !park[answer[0]].substring(answer[1], answer[1]+n+1).contains("X")){
                        answer[1] += n;
                    } break;
                case "W":
                    if(answer[1]-n >=0 && !park[answer[0]].substring(answer[1]-n, answer[1]).contains("X")){
                        answer[1] -= n;
                    } break;
                case "N":
                    if(answer[0]-n >=0){
                        int cnt=0;
                        for(int i=answer[0]-1; i>=answer[0]-n; i--){
                            if(park[i].charAt(answer[1]) == 'X'){
                                cnt++; break;
                            }
                        }
                        if(cnt == 0) answer[0] -= n;
                    }break;
                case "S":
                    if(answer[0]+n < park.length){
                        int cnt=0;
                        for(int i=answer[0]+1; i<=answer[0]+n; i++){
                            if(park[i].charAt(answer[1]) == 'X'){
                                cnt++; break;
                            }
                        }
                        if(cnt == 0) answer[0] += n;
                    }
            }
        }
        
        return answer;
    }
}