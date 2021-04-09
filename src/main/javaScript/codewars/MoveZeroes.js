var moveZeros = function (arr) {
    const filtered = arr.filter(el => el !== 0);
    let zeroes = arr.length - filtered.length;
    for (let i = 0; i < zeroes; i++) {
        filtered.push(0);
    }
    return filtered;
}