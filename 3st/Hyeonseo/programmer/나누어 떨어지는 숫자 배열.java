import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int[] a, int div) {
        List<Integer> list = new ArrayList<>();
        int count = 0;
        	for(int k = 0; k < a.length;k++) {
			if(a[k] % div == 0) {
				list.add(a[k]);
                count++;
			}
		}
        if (count == 0) {
			list.add(-1);
		}
		int[] result = new int[list.size()];
		for(int h = 0; h < list.size(); h++) {
			result[h] = list.get(h).intValue();
		}
        for(int j = 0; j < result.length; j++) {
			for(int i = 0; i < result.length;i++) {	
				if(result[j] < result[i]) {
					int temp = result[i];
					result[i] = result[j];
					result[j] = temp;
				}
			}
		}
        return result;
    }
}