
function lengthConverter(length, fromUnit, toUnit) {
    if (fromUnit === 'meter' && toUnit === 'feet') {
        return length * 3.28084; // 1 meter = 3.28084 feet
    
    } else {
        return 'Invalid conversion';
    }
}
console.log(lengthConverter(1, 'meter', 'feet'));
