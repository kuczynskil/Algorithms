function findOutlier(integers) {
    let evenArr = allEven(integers);
    if (evenArr) {
        for (let i = 0; i < integers.length; i++) {
            if (integers[i] % 2 !== 0) return integers[i];
        }
    } else {
        for (let i = 0; i < integers.length; i++) {
            if (integers[i] % 2 === 0) return integers[i];
        }
    }
}

function allEven(arr) {
    let even = 0, odd = 0;
    for (let i = 0; i < 3; i++) {
        arr[i] % 2 === 0 ? even++ : odd++;
    }
    return even > odd;
}

console.log(findOutlier([2, 4, 0, 100, 4, 11, 2602, 36]))