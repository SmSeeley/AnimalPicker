import java.util.*;

public class AnimalPicker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Welcome to Animal Picker please select 'cat' or 'dog' or 'fish' ");
            String choice = scanner.nextLine().toLowerCase();

            if (choice.equals("dog")) {
                System.out.println("  __      _\no\'\')}____//\n `_/      )\n (_(_/-(_/");
                break;
            } 
            else if (choice.equals("cat")) {
                System.out.println("    fe/\\_____/\\\n   /  o   o  \\\n  ( ==  ^  == )\n   )         (\n  (           )\n ( (  )   (  ) )\n(__(__)___(__)__)");
                break;
            } 
            else if (choice.equals("fish")) {
                System.out.println(" o\no      ______/~/~/~/__           /((\n  o  // __            ====__    /_((\n o  //  @))       ))))      ===/__((\n    ))           )))))))        __((\n    \\\\     \\)     ))))    __===\\ _((\n     \\\\_______________====      \\_((\n                                 \\((");
                break;
            }
            else {
                System.out.println("Error");
                System.out.println("Invalid choice");
            }

        }
    }
}