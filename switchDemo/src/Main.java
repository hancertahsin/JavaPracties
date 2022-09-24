public class Main {
    public static void main(String[] args) {
        char grade = 'F';// char kodu ile çalıştığımız için tek tırnak kullanıyoruz

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel:Geçtiniz");
                break;
            case 'B':
                System.out.println("Çok güzel :Geçtiniz");
                break;
            case 'C':
                System.out.println("İyi :Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena Değil :Geçtiniz");
                break;
            case 'F':
                System.out.println("Mağlesef :Kaldınız");
                break;
            default:
                System.out.println("Geçersiz Not girdiniz");
            // crtl + şift + alt L  ile kodlarımızı düzenleriz
        }
    }
}
