function cakes(recipe, available) {
    let count = Number.MAX_SAFE_INTEGER;
    for (let recipeKey in recipe) {
        if (!(recipeKey in available)) return 0;
        count = Math.min(count, available[recipeKey] / recipe[recipeKey]);
    }
    return Math.floor(count);
}