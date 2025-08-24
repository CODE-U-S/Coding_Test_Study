function solution(sides) {
    // 배열을 오름차순 정렬
    sides.sort((a, b) => a - b);

    // 가장 긴 변이 나머지 두 변의 합보다 작은지 확인
    if (sides[2] < sides[0] + sides[1]) {
        return 1; // 삼각형 가능
    } else {
        return 2; // 삼각형 불가능
    }
}
