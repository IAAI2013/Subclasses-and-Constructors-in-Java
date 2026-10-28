public class Main {
    public static void main(String[] args) {
        // Create and test objects
        Student student = new Student("Alice", 20, "Computer Science");
        Book book = new Book("Young Samurai", "Chris Bradford", 320);

        // Print student details
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
        System.out.println("Student Major: " + student.getMajor());

        // Print book details
        System.out.println("Book Title: " + book.getTitle());        
        System.out.println("Book Author: " + book.getAuthor());
        System.out.println("Book Pages: " + book.getNumPages());
    }
}