function iqTest(numbers) {
    const arr = numbers.split(" ").map(Number);
    let evenArr = allEven(arr);
    if (evenArr) {
        for (let i = 0; i < arr.length; i++) {
            if (arr[i] % 2 !== 0) return i + 1;
        }
    } else {
        for (let i = 0; i < arr.length; i++) {
            if (arr[i] % 2 === 0) return i + 1;
        }
    }
}

const allEven = arr => {
    return arr.filter(el => el % 2 === 0).length > 1;
}

console.log(allEven([1, 2, 1]))