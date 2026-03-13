import java.util.Arrays;
import java.util.List; // Arrays.asList의 반환값을 받기 위한 import

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int answer[] = new int[photo.length];
        List<String> arr = Arrays.asList(name);
        
        for (int i = 0; i < photo.length; i++) {
            for (int j = 0; j < photo[i].length; j++) {
                // int index = Arrays.asList(name).indexOf(photo[i][j]); -> 이걸 반복문 안에서 계속 생성해서 시간이 느려진다나 뭐라나시봉모르겠다
                int index = arr.indexOf(photo[i][j]);    // 이렇게하면 객체 한번만 생성해서 빨라짐
                answer[i] += (index == -1) ? 0 : yearning[index];
            }
        }
        
        return answer;
    }
}