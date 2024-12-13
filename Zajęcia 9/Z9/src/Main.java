public class Main {

        public static void main(String[] args) {
        System.out.println("ZADANIE 1");
        BookDTO book1 = new BookDTO("Harry Potter", "J.K. Rowling", 39.99, 1997);
        BookDTO book2 = new BookDTO("Władcy Pierścieni", "J.R.R. Tolkien", 49.99, 1954);
        BookDTO book3 = new BookDTO("Hobbit", "J.R.R. Tolkien", 24.99, 1970);
        System.out.println("Lista książek w sklepie: ");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        System.out.println("\nZADANIE 2");
        Address address1 = new Address("Witosa", "12", "69-969", "Kraków");
        Address address2 = new Address("Poniatowskiego", "12", "00-500", "Warszawa");

        Person person1 = new Person("Korwin", "Mikke", address1);
        Person person2 = new Person("Grzegorz", "Brown", address2);
        System.out.println("Lista osób: ");
        System.out.println(person1);
        System.out.println(person2);

        System.out.println("\nZADANIE 6");
        Car car1 = new Car("Toyota", "Corolla", 6.5);
        Car car2 = new Car("Opel", "Astra", 5.2);

        double fuelPrice = 6.5;
        double distance = 250;

        System.out.println("Koszt podróży dla samochodów: ");
        System.out.printf("%s %s: %.2f PLN%n", car1.brand(),
                car1.model(), car1.fuelCost(fuelPrice, distance));
        System.out.printf("%s %s: %.2f PLN%n", car2.brand(),
                car2.model(), car2.fuelCost(fuelPrice, distance));

        System.out.println("\nZADANIE 9");
        Person2 person21 = new Person2("Kaziu", 29);
        Person2 person22 = new Person2("Stasiu", -21);

        System.out.println("Przypadki testowe: ");
        System.out.println(person21);
        System.out.println(person22);

        System.out.println("\nZADANIE 10");
        BankAccount account1 = new BankAccount("1234567890");
        BankAccount account2 = new BankAccount("0987654321", 500.0);

        System.out.println("Przypadki testowe: ");
        System.out.println(account1);
        System.out.println(account2);

        System.out.println("\nZADANIE 1* (NA PUNKTY)");
        Book book = new Book("Hobbit", "J.R.R. Tolkien");
        book.addReview(4.5);
        book.addReview(5.0);
        book.addReview(4.8);
        System.out.println(book);

        book.removeReview(5.0);
        System.out.println("Po usunięciu recenzji: " + book);

        FantasyBook fantasyBook = new FantasyBook("Gra o tron", "R.R. Martin", "Epic Fantasy");
        fantasyBook.addReview(4.9);
        fantasyBook.addReview(4.7);
        System.out.println(fantasyBook);

        fantasyBook.setFantasySub("Dark Fantasy");
        System.out.println("Po zmianie podgatunku: " + fantasyBook);
    }
}