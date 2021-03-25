function find_average(array) {
    return array.length < 1 ? 0 : array.reduce((a, b) => a + b) / array.length;
}