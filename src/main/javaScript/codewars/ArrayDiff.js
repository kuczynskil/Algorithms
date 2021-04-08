function arrayDiff(a, b) {
    for (let i = 0; i < b.length; i++) {
        a = a.filter(el => el !== b[i]);
    }
    return a;
}

console.log(arrayDiff([1, 2, 3], [1,2]))