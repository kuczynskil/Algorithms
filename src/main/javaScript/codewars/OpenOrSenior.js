function openOrSenior(data){
    const result = [];
    data.map(el => (el[0] >= 55 && el[1] > 7) ? result.push("Senior") : result.push("Open"));
    return result;
}