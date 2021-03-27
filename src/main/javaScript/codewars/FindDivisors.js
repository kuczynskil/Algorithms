function divisors(integer) {
    const factors = [...Array(integer + 1).keys()].slice(2,-1).filter(num => integer % num === 0);
    return factors.length === 0 ? integer + " is prime" : factors;
}

console.log(divisors(13));