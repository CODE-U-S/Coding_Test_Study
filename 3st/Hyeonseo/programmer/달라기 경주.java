class Solution {
    public String[] solution(String[] player, String[] calling) {
        		for(int i = 0; i < calling.length; i++) {
			for(int j = 0; j < player.length;j++) {
				if(player[j].equals(calling[i])) {
					String str = player[j -1];
					player[j - 1] = player[j];
					player[j] = str;
					}
				}
			}
		return player;
    }
}