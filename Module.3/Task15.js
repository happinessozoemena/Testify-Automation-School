const books = [
    {
         title: "The Little Prince",
         description: "Kindness",
         numberOfPages: "375",
         author: "Gilbert Smith",
         reading: "true" 
    },
    {
        title: "Mystery Girl",
        description: "Not straight forword",
        numberOfPages: "278",
        author: "Hannah Swan",
        reading: "false", 
    },
    {
        title: "The Vengance",
        description: "Hatred From Generation",
        numberOfPages: "407",
        author: "Mike Shawn",
        reading: "true" 
    }

]

for (let book = 0; book <= books.length; book++) {
    if (books[book].reading) {
        console.log(books[book]);
    } 
    
}