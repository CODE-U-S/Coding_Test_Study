class Solution {
    public int[] solution(String myString) {
        String[] parts = myString.split("x", -1);
        int[] lengths = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            lengths[i] = parts[i].length();
        }

        return lengths;
    }
}