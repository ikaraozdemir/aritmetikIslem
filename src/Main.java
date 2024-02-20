import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz:");
        a = input.nextInt();
        System.out.print("İkinci sayıyı giriniz:");
        b = input.nextInt();
        System.out.print("Üçüncü sayıyı giriniz:");
        c = input.nextInt();

        int sonuc = a + b * c - b;
        System.out.print("İşlemin sonucu: " + sonuc);
    }
}