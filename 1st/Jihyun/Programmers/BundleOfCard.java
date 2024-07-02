class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int card1_idx = 0;
        int card2_idx = 0;
        for(String word : goal) {
            if(card1_idx < cards1.length && word.equals(cards1[card1_idx]))
                card1_idx++;
            else if(card2_idx < cards2.length && word.equals(cards2[card2_idx]))
                card2_idx++;
            else
                return "No";
        }
        return "Yes";
    }
}

class BundleOfCard {
    public static void main(String[] args) {
        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        Solution s = new Solution();
	    System.out.println(s.solution(cards1, cards2, goal));	 // "Yes"
    }
}
