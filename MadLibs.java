import java.util.Scanner;
public class MadLibs {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun;
        String adjective2;
        String verb;
        String adjective3;

        System.out.print("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a noun (animal or person): ");
        noun = scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a verb (action): ");
        verb = scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective3 = scanner.nextLine();

        System.out.println("\nThere was a " + adjective1 + " girl in the park");
        System.out.println("Her name was " + noun);
        System.out.println("Beside her, there was a " +adjective2 +" lake");
        System.out.println("She was " +verb + " with a boy");
        System.out.println("Because the boy was " +adjective3);
        
    }
}
