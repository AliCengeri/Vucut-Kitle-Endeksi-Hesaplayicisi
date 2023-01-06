import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        double kilo,boy;
        System.out.print("Kilonuzu Giriniz : ");
        kilo = imput.nextDouble();
        System.out.print("Boyunuzu Metre Cinsinden Giriniz : ");
        boy = imput.nextDouble();
        double vki = kilo/(boy*boy);
        System.out.println("Vücut Kütle Endeksiniz : " + vki);

    }
}