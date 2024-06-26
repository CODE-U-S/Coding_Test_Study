class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for(int i = 0; i < order.length; i++) {
            if(order[i].equals("iceamericano") || order[i].equals("americanoice") || order[i].equals("americano") || order[i].equals("anything") || order[i].equals("hotamericano") || order[i].equals("americanohot"))
                answer += 4500;
            else answer += 5000;
        }
        return answer;
    }
}