function findNb(m) {
    let sum = 0;
    for (let i = 0; i < m; i++) {
        sum = (i * i) * ((i + 1) * (i + 1)) / 4;
        if (sum > m) return -1;
        if (sum === m) return i;
    }
}

console.log(findNb(4183059834009));