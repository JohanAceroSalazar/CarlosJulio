import java.time.LocalDate;

public class Loan {

    public String isbn;
    public Book book;
    public Reader reader;
    public LocalDate loanDate;

    public Loan(Book book, Reader reader) {
        this.book = book;
        this.reader = reader;
        this.isbn = book.isbn;
        this.loanDate = LocalDate.now();
    }

    @Override
    public String toString(){
        return "Loan [book=" + book + ", reader" + reader + ", isbn=" + isbn + ", loanDate" + loanDate + "]";
    }
}