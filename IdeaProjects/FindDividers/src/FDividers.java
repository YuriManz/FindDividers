import java.util.Scanner;
/**
 * Created by Юрий on 30.12.2016.
 */

public class FDividers {

    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println("List of dividers: ");
        for (int i = 1; i <= number; i++) {
            if ((number % i) == 0) {
                System.out.println(i);

            }
        }
    }

}


