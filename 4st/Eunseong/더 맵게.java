import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> scovilleQueue = new PriorityQueue<>();
        for (int i : scoville) {
            scovilleQueue.offer(i);
        }
        int answer = 0;
        while (scovilleQueue.size() >= 2) {
            if (scovilleQueue.peek() >= K) {
                return answer;
            }
            answer++;
            int min1 = scovilleQueue.poll();
            int min2 = scovilleQueue.poll();
            scovilleQueue.offer(min1 + min2 * 2);
        }
        return (scovilleQueue.poll() >= K) ? answer : -1;
    }
}