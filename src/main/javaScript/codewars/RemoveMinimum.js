function removeSmallest(numbers) {
    if (numbers.length === 0) return [];
    const copyArray = [...numbers];
    let min = Math.min(...copyArray);
    copyArray.splice(copyArray.indexOf(min), 1);
    return copyArray;
}