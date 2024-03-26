
function countVowels(str) {
    // Convert the string to lowercase to make the comparison case-insensitive
    str = str.toLowerCase();
    let count = 0;
    
    
    for (let i = 0; i < str.length; i++) {
    
        if (['a', 'e', 'i', 'o', 'u'].indexOf(str[i]) !== -1) {
            
            count++;
        }
    }
    
    return count;
}
    const myString = "Hello, how are you?";
    console.log(countVowels(myString)); 

 