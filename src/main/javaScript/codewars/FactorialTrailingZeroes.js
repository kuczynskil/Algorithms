function zeros(n) {
    let count = 0;
    for (let i = 5; n >= i; i *= 5) {
        count += Math.floor(n / i);
    }
    return count;
}

console.log(zeros(100))