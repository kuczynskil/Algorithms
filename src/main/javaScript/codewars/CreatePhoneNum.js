function createPhoneNumber(numbers){
    const firstThree = numbers.slice(0,3).join("");
    const secondThree = numbers.slice(3,6).join("");
    const rest = numbers.slice(6).join("");
    return "(" + firstThree + ")" + " " + secondThree + "-" + rest;
}

console.log(createPhoneNumber([1, 2, 3, 4, 5, 6, 7, 8, 9, 0]));