function toCamelCase(str) {
    if (str.length === 0) return str;
    const words = str.split(/[^A-Za-z]/);
    let res = "";
    for (let i = 1; i < words.length; i++) {
        res += words[i].charAt(0).toUpperCase() + words[i].slice(1);
    }
    return words[0] + res;
}

console.log(toCamelCase("the-stealth-warrior"));