import java.util.Scanner;

public class GuessingNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i;
        int counter=0;

        do{
            System.out.println("Zgadnij liczbę: ");
            i = scan.nextInt();
            counter++;

            if(i<100){
                System.out.println("Liczba jest za mała ");
            }else if(i>200){
                System.out.println("Liczba jest za duża");
            }else if(i%3 != 0){
                System.out.println("Liczba nie jest podzielna przez 3");

            }
        }
        while ((i<100 || i >200) || i%3!=0);

        System.out.printf("Zgadłeś za %d razem. Gratulacje!. Twoja liczba to %d.", counter,i);

    }
}
