function digital_root(n) {
    let nString = n.toString();
    if (nString.length === 1) return n;
    const digits = nString.split("");
    const sum = digits.reduce((a,b) => +a + +b);
    return sum.toString().length === 1 ? sum : digital_root(sum);
}

console.log(digital_root(2))
