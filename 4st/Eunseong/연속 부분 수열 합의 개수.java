import java.util.HashSet;

class Solution {
    public int solution(int[] elements) {
        HashSet<Integer> hs = new HashSet<>();
        
        int doubleElements[] = new int[elements.length * 2];
        for (int i = 0; i < doubleElements.length; i++) {
            doubleElements[i] = elements[i % elements.length];
        }
        
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                int sum = 0;
                for (int k = j; k < j + i; k++) {
                    sum += doubleElements[k];
                }
                hs.add(sum);
            }
        }
        
        return hs.size();
    }
}