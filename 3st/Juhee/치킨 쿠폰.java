class Solution {
    public int solution(int chicken) {
        int service = 0;

        while (chicken >= 10) {
            service += chicken / 10;
            chicken = (chicken / 10) + (chicken % 10);
        }
        return service;
    }
}
