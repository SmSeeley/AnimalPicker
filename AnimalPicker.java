import java.util.*;

public class AnimalPicker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Welcome to Animal Picker please select 'cat' or 'dog' ");
            String choice = scanner.nextLine().toLowerCase();

            if (choice.equals("dog")) {
                System.out.println("Dog ASCII ART HERE");
                break;
            } else if (choice.equals("cat")) {
                System.out.println("CAT ASCII ART HERE");
                break;
            } else {
                System.out.println("Error");
                System.out.println("Invalid choice");
            }

        }
    }
}