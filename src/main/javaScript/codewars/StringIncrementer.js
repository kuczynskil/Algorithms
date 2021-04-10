function incrementString(str) {
    if (str.length === 0 || isNaN(str.charAt(str.length - 1))) return str + 1;

    let firstNumIndex = str.indexOf(str.match(/\d/));
    let letters = str.substring(0, firstNumIndex);
    let numbers = str.substring(firstNumIndex);
    return letters + zeroPad(parseInt(numbers) + 1, numbers.length);
}

const zeroPad = (num, places) => String(num).padStart(places, '0');
