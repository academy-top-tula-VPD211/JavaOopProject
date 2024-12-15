package books;

public class Book implements IPrintable{
    public String Author;
    public String Title;

    public Book(String author, String title){
        this.Author = author;
        this.Title = title;
    }

    @Override
    public void print() {
        System.out.printf("Author: %s, Title: %s", this.Author, this.Title);
    }
}
