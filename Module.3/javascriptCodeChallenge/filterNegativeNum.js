
function filterNegativeNumbers(numbers) {
    return numbers.filter(number => number >= 0);
}

const numbers = [1, -2, 3, -4, 15, -6];
const filteredNumbers = filterNegativeNumbers(numbers);
console.log(filteredNumbers);
