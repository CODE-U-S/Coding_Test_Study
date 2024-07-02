function solution(keymap, targets) {
    let spelling = new Map();
    let spell_num = 0;
    let answer = [];

    for(let i = 65; i <= 90; i++){
        let spell = String.fromCharCode(i);
        spell_num=101;
        for(let key of keymap){
            if(spell_num > key.indexOf(spell) && key.indexOf(spell) !== -1){
                spell_num = key.indexOf(spell);
            }
        }
        spelling.set(spell, spell_num);
    }

    for(let str of targets){
        let min = 0;
        for(let char of str){
            if(spelling.get(char) == 101){
                min = -1;
                break;
            }else{
                min += spelling.get(char) + 1;
            }
        }
        answer.push(min);
    }

    return answer;
}
