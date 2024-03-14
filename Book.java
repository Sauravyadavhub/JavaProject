package Project.Assigment1.Question1;

class Book {
    int bookId;
    String bookName;
    String authorName;
    Book(int bookId, String bookName, String authorName){
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }
    public String toString(){

        return "book Id : "+ bookId + "bookName : "+bookName + "authorName : "+authorName;
    }
}
