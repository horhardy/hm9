public class Main {
    public static void main(String[] args) {
        Author author = new Author("Bakumets", "Vadim");
        Book book = new Book( "IT", author, 2021);
        System.out.println((book));
    }
}