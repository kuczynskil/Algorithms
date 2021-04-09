function sumPairs(ints, s) {
    const set = new Set();
    for (let i = 0; i < ints.length; i++) {
        let remainder = s - ints[i];
        if (set.has(remainder)) return [remainder, ints[i]];
        else set.add(ints[i]);
    }
    return undefined;
}

console.log(sumPairs([4, 3, 2, 3, 4], 6));