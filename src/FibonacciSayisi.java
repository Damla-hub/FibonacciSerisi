import java.util.Scanner;

public class FibonacciSayisi {
    public static void main(String[] args) {
        int number;
        int sayi1 = 0, sayi2 = 1, sayi3;
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisi eleman sayısını giriniz:");
        number = input.nextInt();
        while (number < 0) {
            System.out.println("Pozitif sayı giriniz!!!");
            System.out.print("Fibonacci serisi eleman sayısını giriniz:");
            number = input.nextInt();
        }
        switch (number) {
            case 0:
                System.out.print("Eleman sayısı 0 olarak girildi.Seri oluşturulamadı.");
                break;
            case 1:
                System.out.print(sayi1);
                break;
            case 2:
                System.out.print(sayi1 + " " + sayi2);
                break;
            default:
                System.out.print(sayi1 + " " + sayi2);
                for (int i = 2; i < number; i++) {
                    sayi3 = sayi2 + sayi1;
                    sayi1 = sayi2;
                    sayi2 = sayi3;
                    System.out.print(" " + sayi3);
                }
        }


    }
}
