import java.util.Arrays;

class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        String[][] pic = new String[picture.length][];
        for(int i = 0; i < answer.length; i++)
            answer[i] = "";
        for(int i = 0; i < picture.length; i++)
            pic[i] = picture[i].split("");
        
        for(int i = 0; i < pic.length * k; i++) {
            for(int j = 0; j < pic[i / k].length * k; j++) {
                answer[i] += pic[i / k][j / k];
            }
        }
        return answer;
    }
}

public class EnlargeThePicture {
	public static void main(String[] args) {
		Solution s = new Solution();
		String[] a = {"x.x", ".x.", "x.x"};
		int b = 3;
		System.out.println(Arrays.toString(s.solution(a, b)));	 // ["xxx...xxx", "xxx...xxx", "xxx...xxx", "...xxx...", "...xxx...", "...xxx...", "xxx...xxx", "xxx...xxx", "xxx...xxx"]
	}
} 
