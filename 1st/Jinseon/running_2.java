import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];

		HashMap<String, Integer> m_player = new HashMap<>();
		HashMap<Integer, String> m_rank = new HashMap<>();

		for (int i = 0; i < players.length; i++) {
			m_player.put(players[i], i);
			m_rank.put(i, players[i]);
		}

		for (int i = 0; i < callings.length; i++) {
			int current_rank = m_player.get(callings[i]);
			String player = m_rank.get(current_rank);
			String front_player = m_rank.get(current_rank - 1);

			m_player.put(player, current_rank - 1);
			m_player.put(front_player, current_rank);
			m_rank.put(current_rank - 1, player);
			m_rank.put(current_rank, front_player);
		}

		for (int i = 0; i < players.length; i++) {
			answer[i] = m_rank.get(i);
		}
        return answer;
    }
}
