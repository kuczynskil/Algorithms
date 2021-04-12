function nextBigger(n) {
    if (n < 10) return -1;
    const digits = n.toString().split("").map(Number);
    let index = -1;
    let res = "";
    let joiningNum;
    let joiningNumIndex;

    for (let i = digits.length - 1; i > 0; i--) {
        for (let j = i - 1; j >= 0; j--) {
            if (digits[i] > digits[j]) {
                if (j > index) {
                    index = j;
                    joiningNum = digits[i];
                    joiningNumIndex = i;
                }
            }
        }
    }

    if (index === -1) return -1;

    for (let i = 0; i < index; i++) {
        res += digits[i];
    }
    res += joiningNum;
    digits.splice(joiningNumIndex, 1);
    digits.splice(0, index);
    digits.sort((a, b) => a - b);

    for (let i = 0; i < digits.length; i++) {
        res += digits[i];
    }
    return Number(res);
}

const arr = [1, 2, 3];
console.log(nextBigger(112));