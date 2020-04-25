import model.Library;
import model.Book;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Scanner SCANNER= new Scanner(System.in);

    public static void main(String[] args) {

        Library library = createLibraryWithBooks();

        System.out.println("Witaj w bibliotece! Co mogę dla ciebie zrobić?");

        String jeden = "1) Wyświetl wszystkie książki";
        String dwa = "2) Dodaj książkę";
        String trzy = "3) Usuń książkę";

        while (true) {
            menu();
            int option = SCANNER.nextInt();

            switch (option) {


                case 1:
                    library.printAllBooks();
                    break;
                case 2:
                    System.out.println(dwa);
                    break;
                case 3:
                    System.out.println(trzy);
                    break;
                default:
                    System.out.println("Operacja o tym numerze jeszcze nie istnieje");
                    break;

            }

        }

        }

    private static void menu() {
        System.out.println("1) Wyświetl wszystkie książki");
        System.out.println("2) Dodaj książkę");
        System.out.println("3) Usuń książkę");
        System.out.println("Wybieram: ");
    }
    private static Library createLibraryWithBooks() {
        return new Library(new Book[]{
                new Book("Juliusz Słowacki", "Balladyna", "9788373272170"),
                new Book("Jan Brzechwa", "Akademia pana Kleska", "9788371530326"),
                new Book("Arkady Fiedler", "Dywizjon 303", "9788381271738"),
                new Book("Henryk Sienkiewicz", "Latarnik", "9788387139803"),
                new Book("Juliusz Słowacki", "Kordian", "9788389524027")
        });
    }
}

