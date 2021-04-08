function alphabetPosition(text) {
    text = text.toUpperCase();
    let res = "";
    for (let i = 0; i < text.length; i++) {
        if (text.charAt(i).match(/[A-Z]/)) res += text.charCodeAt(i) - 64 + " ";
    }
    return res.trim();
}
