function anagrams(word, words) {
    const res = [];
    let sortedWord = word.split("").sort().join("");
    const sortedWords = words.map(el => el.split("").sort().join(""));
    for (let i = 0; i < words.length; i++) {
        if (sortedWords[i] === sortedWord) res.push(words[i]);
    }
    return res;
}

console.log(anagrams('laser', ['lazing', 'lazy',  'lacer']));