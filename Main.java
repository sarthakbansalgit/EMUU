public class Main {
    public static void main(String[] args) {
        LibraryContract student = new Student("Aarav");
        LibraryContract teacher = new Teacher("Mrs. Sharma");

        student.borrowBook("Java Programming");
        student.returnBook("Java Programming");

        teacher.borrowBook("Object-Oriented Design");
        teacher.returnBook("Object-Oriented Design");
    }
}
