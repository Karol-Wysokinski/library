import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Scanner SCANNER;

    public static void main(String[] args) {

        System.out.println("Witaj w bibliotece! Co mogę dla ciebie zrobić?");
        SCANNER = new Scanner(System.in);


        String jeden = "1) Wyświetl wszystkie książki";
        String dwa = "2) Dodaj książkę";
        String trzy = "3) Usuń książkę";


        while (true) {
            menu();
            int option = SCANNER.nextInt();

            switch (option) {


                case 1:
                    System.out.println(jeden);
                    break;
                case 2:
                    System.out.println(dwa);
                    break;
                case 3:
                    System.out.println(trzy);
                    break;
                default:
                    System.out.println("Operacja o tym numerze jeszcze nie istnieje");


            }


        }
        private static void menu() {
            System.out.println("1) Wyświetl wszystkie książki");
            System.out.println("2) Dodaj książkę");
            System.out.println("3) Usuń książkę");
            System.out.println("Wybieram: ");
        }
    }
}

