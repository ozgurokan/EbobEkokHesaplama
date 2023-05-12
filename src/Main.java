import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1, number2, temp = 1, ebob = 0, ekok;

        Scanner input = new Scanner(System.in);

        // Kullanıcıdan kontrol etmek istedikleri değerler alınır
        System.out.print("Birinci Sayı: ");
        number1 = input.nextInt();

        System.out.print("İkinci Sayı: ");
        number2 = input.nextInt();

        // temp sayısı iki değerden birinden küçük olduğu sürece bölen bulma değeri tekrarlanır
        do {
            // temp sayısı iki sayıyı da kalansız bölüyor ise ortak bölendir ve her seferinde ebob değerine atanır. Bölyece en son aatnan ebob değeri en büyük ortak bölen olur
            if ((number1 % temp == 0) && (number2 % temp == 0)) {
                ebob = temp;
            }
            temp++;

        } while ((number1 > temp) || (number2 > temp));

        // ekok formülü yazılır ve ekok bulunur
        ekok = (number1 * number2) / ebob;

        // çıktı verilir
        System.out.println("Bu Sayıların EBOB'u: " + ebob);
        System.out.println("Bu Sayıların EKOK'u: " + ekok);
    }
}