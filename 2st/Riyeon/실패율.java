import java.util.*;

class Solution {
	static class Point implements Comparable<Point> {
		int x;
		double y;

		public Point(int x, double y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public int compareTo(Point o) {
			if (o.y == this.y) {
				return this.x - o.x;
			}
			return Double.compare(o.y, this.y);
		}
	}
	public int[] solution(int N, int[] stages) {
		List<Point> list = new ArrayList<>();
		Arrays.sort(stages);
		int size = stages.length;
		int idx = 0;
		for (int i = 1; i <= N; i++) {
			int cnt = 0;
			for (int j = idx; j < stages.length; j++) {
				if (stages[j] > i) {
					break;
				}
				cnt++;
				idx++;
			}
            if(cnt == 0){
                list.add(new Point(i, 0));
                continue;
            }
			list.add(new Point(i, (double)cnt / size));
			size -= cnt;
		}
		Collections.sort(list);
		int[] answer = new int[N];
		for (int i = 0; i < N; i++) {
			answer[i] = list.get(i).x;
		}
		return answer;
    }
}