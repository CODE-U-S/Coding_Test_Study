import java.util.ArrayList;
import java.util.List;
class Solution {
   public String[] solution(String[] names) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
			if(i % 5 == 0) list.add(names[i]);
        }
        
        return list.toArray(new String[list.size()]);
    }
}
