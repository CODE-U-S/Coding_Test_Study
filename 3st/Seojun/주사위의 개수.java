class Solution {
    public int solution(int[] box, int n) {
    
        int widthFit = box[0] / n; 
        int heightFit = box[1] / n; 
        int depthFit = box[2] / n; 

        return widthFit * heightFit * depthFit;
    }
}
