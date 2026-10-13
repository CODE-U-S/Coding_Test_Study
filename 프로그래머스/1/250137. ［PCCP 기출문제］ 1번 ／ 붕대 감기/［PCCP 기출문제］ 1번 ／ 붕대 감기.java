class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0; // 현재 체력
        int success = 0; // 연속 성공 횟수
        int max = health; // 최대 체력
        int time = 0; // 시간
        boolean attack = false; // 공격 여부
        int attackIndex = 0; // 공격 배열의 인덱스

        int lastTime = attacks[attacks.length - 1][0];

        for (time = 1; time <= lastTime; time++) {
            attack = false;

            // 공격하기
            if (attackIndex < attacks.length && attacks[attackIndex][0] == time) {
                health -= attacks[attackIndex][1];
                success = 0;
                attack = true;
                attackIndex++;

                // 체력이 0 이하이면 사망
                if (health <= 0) {
                    return -1;
                }
            }

            // 공격 시간 아닐 때
            if (!attack) {
                health += bandage[1];
                success++;

                // 연속 성공 시 추가 회복
                if (success == bandage[0]) {
                    health += bandage[2];
                    success = 0;
                }

                // 최대 체력 제한
                if (health > max) {
                    health = max;
                }
            }
        }

        answer = health;
        return answer;
    }
}