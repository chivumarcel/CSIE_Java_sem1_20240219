import java.util.Scanner; // Importăm clasa Scanner

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        Scanner scanner = new Scanner(System.in); // Creăm un obiect Scanner pentru a citi de la consola
        System.out.println("Introduceti numele: "); // Afișăm un mesaj pentru utilizator
        String nume = scanner.nextLine(); // Citim linia introdusă de utilizator și o stocăm în variabila 'nume'
        System.out.println("Salutare " + nume + "!"); // Afișăm numele citit de la consola

        System.out.print("a= ");
        int a = Integer.parseInt(scanner.nextLine()); // asta e metoda mai buna

        System.out.print("b= ");
        int b = scanner.nextInt();

        System.out.println("a= "+a);
        System.out.println("b= "+b);
        System.out.println("a+b= "+(a+b));
        System.out.println(
                String.format("%d + %d = %d%n", a,b,a+b)
        );
        System.out.printf("%d + %d = %d%n", a,b,a+b); //sau - scrie sau si iti autocompleteaza
    }
}