const abbrevName = name => {
    const arr = name.toUpperCase().split(" ");
    return arr[0].charAt(0) + "." + arr[1].charAt(0);
}