const books = {
    title:'the Little Princess',
    description:'Kindiness',
    numberOfPages:'250',
    authour:'Gilbert Smith',
    reading: true,
     
    toggleReadingStatus: function(){
        if(books.reading === true) {
            books.reading = false
        } else {
            books.reading = true
        }
    }
 }
     
         books.toggleReadingStatus()
         console.log(books.reading)

 
