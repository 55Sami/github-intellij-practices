package Aggregation;

public class Main {
    //aggregation
    public static void main(String[] args) {

        Book book1 = new Book("Harry Potter",3400);
        Book book2 = new Book("the two towers ",234);
        Book book3 = new Book("the return of the king",567);


        Book[] books ={book1,book2,book3};

       // for(Book book : books){
         //  System.out.println(book.displayInfo());
       //}

        Library library = new Library("NYC Public library",1897,books);

        library.displayInfo();

    }
}
