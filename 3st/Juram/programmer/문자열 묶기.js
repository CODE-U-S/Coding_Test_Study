function solution(strArr) {
    const count = {}
    
    for (const str of strArr){
        const len = str.length
        count[len] = (count[len] || 0) + 1;
    }
    
    return Math.max(...Object.values(count));
}