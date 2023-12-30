import java.util.Scanner;

public class Main {

    static int mod(int taban, int us) {
        int result = 1;
        for (int i = 1; i <= us; i++) {
            result *= taban;


        }
        return result;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);


        System.out.println("Taban Değerini Giriniz: ");
        int taban= inp.nextInt();

        System.out.println("Üssünü Giriniz: ");
        int us= inp.nextInt();

        System.out.println(mod(taban,us));
    }
}