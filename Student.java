public class Student implements LibraryContract {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void borrowBook(String bookTitle) {
        System.out.println(name + " borrowed the book: " + bookTitle);
    }

    @Override
    public void returnBook(String bookTitle) {
        System.out.println(name + " returned the book: " + bookTitle);
    }
}
