import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Book> books = new ArrayList<>();
    static List<Reader> readers = new ArrayList<>();
    static List<Loan> loans = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;

        do {
            System.out.println("Sistema de biblioteca");
            System.out.println("1. Registrar libro");
            System.out.println("2. listar libros");
            System.out.println("3. Filtrar libros por ISBN");
            System.out.println("4. Registrar lector");
            System.out.println("5. Listar lectores");
            System.out.println("6. Filtrar lectores por Id");
            System.out.println("7. Realizar prestamo de un libro");
            System.out.println("8. Listar prestamos");
            System.out.println("9. Filtrar prestamos por fecha");
            System.out.println("10. Devolver prestamo");
            System.out.println("0. salir");
            System.out.println("opcion:");
            opcion = sc.nextInt();
            sc.nextLine();
            
            switch (opcion) {
                case 1:
                    registerBook();
                    break;
                case 2:
                    getListBooks();
                    break;
                case 3:
                    getFilterBooks();
                break;
                case 4:
                    registerReader();
                break;
                case 5:
                    getListReaders();
                break;
                case 6:
                    getFilterReaders();
                    break;
                case 7:
                    makeLoan();
                    break;
                case 8:
                    listLoans();
                    break;
                case 9:
                    getFilterLoan();
                    break;
                case 10:
                    returnLoan();
                    break;
                case 11:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }

        } while (opcion != 8);
        System.out.println("Adios");
    }

    public static void registerBook() {
        Book book = new Book(null, null, null, null, null);
        System.out.println("ISBN del libro");
        book.isbn = sc.nextLine();
        for (Book b : books) {
            if (b.isbn.equals(book.isbn)) {
                System.out.println("Error ISBN del libro repetido.");
            return;
            }
        }
        System.out.println("Titulo del libro:");
        book.title = sc.nextLine();
        System.out.println("Autor del libro:");
        book.author = sc.nextLine();
        System.out.println("Genero del libro:");
        book.genere = sc.nextLine();
        System.out.println("Fecha de publicacion del libro:");
        String publicationDate = sc.nextLine();
        book.publicationDate = LocalDate.now();
        books.add(book);
        System.out.println("Libro registrado");
    }

    public static void getListBooks() {
        System.out.println("Listado de libros");
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).toString());
        }
        if (books.size() == 0) {
            System.out.println("No hay libros registrados");
        }
    }

    public static void getFilterBooks() {
    System.out.print("ISBN del libro: ");
    String isbn = sc.nextLine();
    for (Book b : books) {
        if (b.isbn.equalsIgnoreCase(isbn)) {
            System.out.println(b);
        return;
            }
        }
        System.out.println("Libro no encontrado");
    }

    public static void registerReader() {
        Reader reader = new Reader(0, null, 0, 0);
        System.out.println("Id del lector");
        reader.id = sc.nextInt();
        for (Reader r : readers) {
            if (r.id == reader.id) {
                System.out.println("Error ISBN del libro repetido.");
            return;
            }
        }
        System.out.println("Nombre del lector:");
        reader.name = sc.nextLine();
        System.out.println("Telefono del lector:");
        reader.telephone = sc.nextInt();
        System.out.println("Edad del lector:");
        reader.age = sc.nextInt();
        readers.add(reader);
        System.out.println("Lector registrado");
        sc.nextLine();
    } 
    public static void getListReaders() {
        System.out.println("Listado de lectores");
        for (int i = 0; i < readers.size(); i++) {
            System.out.println(readers.get(i).toString());
        }
        if (readers.size() == 0) {
            System.out.println("No hay libros registrados");
        }
    }

    public static void getFilterReaders() {
    System.out.print("Id del lector: ");
    int id = sc.nextInt();
    for (Reader r : readers) {
        if (r.id == id) {
            System.out.println(r);
        return;
            }
        }
        System.out.println("Lector no encontrado");
    }

    public static void makeLoan() {
        if (books.isEmpty() || readers.isEmpty()) {
            System.out.println("No se puede realizar préstamo. Verifique que existan libros y lectores registrados.");
            return;
        }
        
        System.out.println(" Realizar préstamo ");
        System.out.println("Libros disponibles:");
        getListBooks();
        
        System.out.print("Seleccione el número del libro: ");
        int bookIndex = sc.nextInt() - 1;
        sc.nextLine();
        
        if (bookIndex < 0 || bookIndex >= books.size()) {
            System.out.println("Índice de libro no válido");
            return;
        }
        
        System.out.println("Lectores disponibles:");
        getListReaders();
        
        System.out.print("Seleccione el número del lector: ");
        int readerIndex = sc.nextInt() - 1;
        sc.nextLine();
        
        if (readerIndex < 0 || readerIndex >= readers.size()) {
            System.out.println("Índice de lector no válido");
            return;
        }
        
        Book selectedBook = books.get(bookIndex);
        Reader selectedReader = readers.get(readerIndex);
        
        Loan loan = new Loan(selectedBook, selectedReader);
        loans.add(loan);
        System.out.println("Préstamo realizado con éxito");
        System.out.println("Detalles del préstamo:");
        System.out.println(loan);
    }

    public static void listLoans() {
        System.out.println("Listado de préstamos");
        if (loans.isEmpty()) {
            System.out.println("No hay préstamos registrados");
        } else {
            for (int i = 0; i < loans.size(); i++) {
                System.out.println((i+1) + ". " + loans.get(i));
            }
        }
    }

    public static void getFilterLoan() {
    System.out.print("Fecha de prestamo: ");
    String fechaTexto  = sc.nextLine();
    for (Loan l : loans) {
        if (l.loanDate.toString().equals(fechaTexto)) {
            System.out.println(l);
        return;
            }
        }
        System.out.println("Prestamo no encontrado");
    }

    
    public static void returnLoan() {
        if (loans.isEmpty()) {
            System.out.println("No hay préstamos para devolver");
            return;
        }
        
        System.out.println("Devolver préstamo");
        listLoans();
        
        System.out.print("Seleccione el número del préstamo a devolver: ");
        int loanIndex = sc.nextInt() - 1;
        sc.nextLine();
        
        if (loanIndex < 0 || loanIndex >= loans.size()) {
            System.out.println("Índice de préstamo no válido");
            return;
        }
        
        Loan loan = loans.remove(loanIndex);
        System.out.println("Préstamo devuelto con éxito");
        System.out.println("Detalles del préstamo devuelto:");
        System.out.println(loan);
    }
}