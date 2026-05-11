function solution(board, moves) {
    let stack = [];
    let answer = 0;
    for (const i of moves) {
        for (let j = 0; j < board.length; j++) {
            if (board[j][i - 1] !== 0) {
                if (stack.length !== 0) {
                    let peek = stack.pop();
                    if (peek === board[j][i - 1]) {
                        answer += 2;
                    } else {
                        stack.push(peek);
                        stack.push(board[j][i - 1]);
                    }
                } else {
                    stack.push(board[j][i - 1]);
                }
                board[j][i - 1] = 0;
                break;
            }
            if (j === board.length - 1) continue;
        }
    }
    return answer;
}