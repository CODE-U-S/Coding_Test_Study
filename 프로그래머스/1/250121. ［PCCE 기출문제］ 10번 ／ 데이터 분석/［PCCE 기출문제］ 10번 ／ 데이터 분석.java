import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};
        // 번호(code), 제조일(date), 최대 수량(maximum), 현재 수량(remain)
        // ext - 기준, val_ext - 기준값, sort_by - 정렬 기준
        // date, 20300501, remain
        // 제조일이 20300501 이전인 물건들을 현재 수량이 적은 순서로 정렬 (오름차순)
        
        int standard = -1;
        int sort = -1;
        
        // 기준값 숫자로 변경
        if (ext.equals("code")) {
            standard = 0;
        }
        else if (ext.equals("date")) {
            standard = 1;
        }
        else if (ext.equals("maximum")) {
            standard = 2;
        }
        else if (ext.equals("remain")) {
            standard = 3;
        }
        
        if (sort_by.equals("code")) {
            sort = 0;
        }
        else if (sort_by.equals("date")) {
            sort = 1;
        }
        else if (sort_by.equals("maximum")) {
            sort = 2;
        }
        else if (sort_by.equals("remain")) {
            sort = 3;
        }
        
        List<int[]> list = new ArrayList<>();
        // 조건에 해당하는 것만 선택
        for (int i = 0; i < data.length; i++) {
            if (data[i][standard] < val_ext) {
                list.add(data[i]);
            }
        }
        
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i)[sort] > list.get(j)[sort]) {
                    int[] temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        
        answer = new int[list.size()][4];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}