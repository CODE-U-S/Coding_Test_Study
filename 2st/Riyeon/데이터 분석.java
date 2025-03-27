import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        String str[] = {"code", "date", "maximum", "remain"};
        int ext_idx = Arrays.asList(str).indexOf(ext);
        int sort_idx = Arrays.asList(str).indexOf(sort_by);
        
        List<int[]> list = new ArrayList<>();
        for(int[] arr : data){
            if(val_ext > arr[ext_idx]){
                list.add(arr);
            }
        }
        
        list.sort(Comparator.comparingInt(o -> o[sort_idx]));
        
        return list.toArray(new int[0][]);
    }
}