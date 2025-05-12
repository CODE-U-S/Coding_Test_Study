function solution(board, moves) {
    let answer = 0;
    let stack = [];

    for (let i = 0; i < moves.length; i++) {
        for (let j = 0; j < board.length; j++) {
            if (board[j][moves[i] - 1] != 0) {
                board[j][moves[i] - 1] = 0;
                if (stack.length != 0 && stack[stack.length - 1] == board[j][moves[i] - 1]) {       
                    stack.pop();
                    answer += 2;
                    break;
                }
                else {
                    stack.push(board[j][moves[i] - 1]);
                    break;
                }
            }
        }
    }
    return answer;
}