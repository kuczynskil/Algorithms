function firstNonRepeatingLetter(s) {
    const chars = [...s.toLowerCase()];
    const uniqueChars = chars.filter(function (item) {
        return chars.lastIndexOf(item) === chars.indexOf(item);
    });
    if (uniqueChars.length === 0) return "";
    let res = '';
    for (let i = 0; i < s.length; i++) {
        if (s.charAt(i) === uniqueChars[0] || s.charAt(i) === uniqueChars[0].toUpperCase()) {
            res = s.charAt(i);
            break;
        }
    }

    return res;
}

console.log(firstNonRepeatingLetter('stressT'))