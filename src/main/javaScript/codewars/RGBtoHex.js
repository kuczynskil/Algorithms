function rgb(r, g, b) {
    const rgb = [r, g, b];
    for (let i = 0; i < rgb.length; i++) {
        if (rgb[i] > 255) rgb[i] = 255;
        if (rgb[i] < 0) rgb[i] = 0;
    }
    return rgb.map(el => el.toString(16))
        .reduce((str, rgb) => str + (rgb.length === 1 ? "0" + rgb : rgb), "").toUpperCase();
}