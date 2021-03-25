function sumArray(array) {
    if (array === null || array.length < 2) return 0;
    return array.reduce((a, b) => a + b, 0) - Math.max.apply(null, array) - Math.min.apply(null, array);
}

const arr = [1, 2, 3];
console.log(sumArray([1, 2, 3]));
console.log(Math.max(...arr));