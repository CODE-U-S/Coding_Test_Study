function solution(operations) {
    const heap = [];
    const op = operations.map(operation => operation.split(' '));

    op.forEach(num => {
        if(num[0] === 'I') {	
            heap.push(Number(num[1]))
        }
        else {	
            const findValue = (num[1] === '1' ? Math.max : Math.min)(...heap);
            const delIdx = heap.indexOf(findValue);
            heap.splice(delIdx, 1);
        }
    })
    
    return heap.length ? [Math.max(...heap), Math.min(...heap)] : [0, 0];
}