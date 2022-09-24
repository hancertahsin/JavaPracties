import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün Hava Çok Güzel.";
        System.out.println(mesaj);


/*        System.out.println("Eleman sayısı:" + mesaj.length());
        System.out.println("5. eleman :" + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın!"));
        System.out.println(mesaj.startsWith("B"));  // Buün Hava Çok Güzel . B il başlıyor mu ? true
        System.out.println(mesaj.endsWith("."));    // . ile bitiyor mu ? true
        char[] karakterler=new char[5];  // 5 karakterli Bugün kelimesini
        mesaj.getChars(0,5,karakterler,0); // 0. karakterinden başlayarak 5. karaktere kadar yazdır
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('a'));   //Bugün Hava Çok Güzel'in içerisinde kaçıncı
        System.out.println(mesaj.indexOf("av"));    // eleman olduğunu bulmamıza yarar
        System.out.println(mesaj.lastIndexOf("a")); // aramaya sondan başlıyor*/

        String yeniMesaj = mesaj.replace(' ', '-'); // Bugün... metnindeki boşluk karakterini
        System.out.println(yeniMesaj);                           // '-' ile değiştiştiriyoruz

        System.out.println(mesaj.substring(2,5)); //Bugün.. metnindeki 2. indeks den başla 5. indekse kadar parçala

        for(String kelime:mesaj.split(" ")) {//Bugün .. metnindeki kelimelerine böler (boşluk karakterler bulunur
            System.out.println(kelime);
        }

         System.out.println(mesaj.toLowerCase());//bütün harfleri küçük yazdırır
         System.out.println(mesaj.toUpperCase()); //bütün harfleri BÜYÜK yazdırır
        System.out.println(mesaj.trim());        // metnin başında ya da sonunda boşluk var ise onu düzeltir
    }
}
