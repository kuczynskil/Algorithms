function pigIt(str) {
    let res = str.split(" ").map(el => (el + el.charAt(0) + "ay").substring(1)).join(" ");
    if (!res.charAt(res.length - 3).match(/[a-zA-Z]/)) res = res.slice(0, -2);
    return res;
}

console.log(pigIt("This is my string"))