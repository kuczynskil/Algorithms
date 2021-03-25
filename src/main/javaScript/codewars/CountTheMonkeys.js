function monkeyCount(n) {
    return [...Array(n + 1).keys()].slice(1);
}