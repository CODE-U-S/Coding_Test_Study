import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> li = new ArrayList<>();
        int[] tod = new int[3];
        int i = 0;
        for (String t : today.split("\\.")) {
            tod[i++] = Integer.parseInt(t);
        }

        for (i = 0; i < privacies.length; i++) {
            String[] sp = privacies[i].split(" ");
            for (String tm : terms) {
                if (tm.startsWith(sp[1])) {
                    String[] priv = sp[0].split("\\.");
                    int y = Integer.parseInt(priv[0]);
                    int m = Integer.parseInt(priv[1]) + Integer.parseInt(tm.substring(2));
                    int d = Integer.parseInt(priv[2]);

                    while (m > 12) {
                        y++;
                        m -= 12;
                    }

                    if (tod[0] > y || (tod[0] == y && (tod[1] > m || (tod[1] == m && tod[2] >= d)))) {
                        li.add(i + 1);
                    }
                    break;
                }
            }
        }

        return li.stream().mapToInt(Integer::intValue).toArray();
    }
}
