function solution(n) {
    return n < 4 ? 0 : [...Array(n).keys()]
        .slice(1)
        .filter(el => (el % 3 === 0 || el % 5 === 0))
        .reduce((x, y) => x + y);
}

console.log(solution(10));