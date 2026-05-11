class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        
        int row = box[0] / n;
        int colum = box[1] / n;
        int height = box[2] / n;
        
        answer = row * colum * height;
        return answer;
    }
}