class Book{
    String title;

    Book(String incomingTitle){
        this.title= incomingTitle;
    }
}

public class Practice5 {
    public static void main(String[] args) {
        Book myBook = new Book("One piece");
        System.out.println(myBook.title);
    }
}
