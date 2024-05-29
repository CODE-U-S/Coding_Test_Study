class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        int j=0;
        for(int i=0; i<picture.length; i++){
            String str = "";
            for(String s : picture[i].split("")){
                for(int n=0; n<k; n++)
                    str += s;
            }
            for(int n=0; n<k; n++, j++)
                answer[j] = str;
        }
        
        return answer;
    }
}