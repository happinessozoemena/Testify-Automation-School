
function printMultiplicationTable(size) {
    for (var i = 1; i <= size; i++) {
        var row = "";
        for (var j = 1; j <= size; j++) {
            row += (i * j) + "\t";
        }
        console.log(row);
    }
}

// Call the function to print a multiplication table of size you need 6
printMultiplicationTable(6);
