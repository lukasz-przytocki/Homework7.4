import java.util.Scanner;

public class GuessingNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i=0;

        while (i<100 || i >200){
            System.out.println("Zgadnij liczbę: ");
            i = scan.nextInt();
        }
        System.out.println("Zgadłeś, graulacje! " + i);

    }
}
