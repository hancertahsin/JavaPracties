public class Maim {
    public static void main(String[] args) {  //İki sayı birbirinin kendisi hariç bölenleri
        int sayı1 = 220;                       // toplamına eşitse bu sayılara arkadaş sayılar denir.
        int sayı2 = 284;
        int toplam1 = 0;
        int toplam2 = 0;

        for (int i = 1; i < sayı1; i++) {
            if (sayı1 % i == 0) {
                toplam1 = toplam1 + i;
            }
        }
        for (int i = 1; i < sayı2; i++) {
            if (sayı2 % i == 0) {
                toplam2 = toplam2 + i;
            }
        }
        if (sayı1==toplam2 &&sayı2==toplam1) {    //&& and operatörüdür ve iki koşulunda tutuması gerekli
            System.out.println("Bu iki sayı arkadaştır");
        }else {
            System.out.println("Bu iki sayı arkadaş Değildir");
        }
    }
}
