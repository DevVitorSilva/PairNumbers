import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers will you enter? ");
        int quantity = sc.nextInt();
        int[] numbers = new int[quantity];
        int quantityNumbersPair = 0;
        for(int i = 0; i < quantity; i++){
            System.out.print("Enter a number: ");
            numbers[i] = sc.nextInt();
        }
        System.out.println("Pair numbers:");
        for(int i = 0; i < quantity; i++){
            if(numbers[i] % 2 == 0){
                System.out.print(numbers[i] + " ");
                quantityNumbersPair++;
            }
        }
        System.out.println("\nNumber pair quantity: " + quantityNumbersPair);
        sc.close();
    }
}