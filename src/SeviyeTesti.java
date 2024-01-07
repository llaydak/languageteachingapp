import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class SeviyeTesti {
    String[] sorular = new String[5];
    String[] secenekler = new String[5];
    String[] cevaplar = new String[5];
    int skor;
    int sorusayaci;

    int testiBaslat() {
        Scanner scanner = new Scanner(System.in);
        Date baslangic = new Date();
        while (sorusayaci < sorular.length) {
            System.out.println(sorular[sorusayaci]);
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(cevaplar[sorusayaci])) {
                skor++;
            }
            sorusayaci++;
        }
        Date bitis = new Date();
        long gecenSure = bitis.getTime() - baslangic.getTime();
        String gecenSureFormatli = sureFormat(gecenSure);

        System.out.println("Toplam geçen süre: " + gecenSureFormatli);
        return skor;
    }

    private String sureFormat(long milisaniye) {
        SimpleDateFormat formatdakikasaniye = new SimpleDateFormat("mm:ss");
        return formatdakikasaniye.format(new Date(milisaniye));
    }

    private String sureFormat(Date date) {
        SimpleDateFormat formatDakikaSaniye = new SimpleDateFormat("DD/MM/yyyy HH:mm:ss");
        return formatDakikaSaniye.format(date);
    }

    abstract void seviyeAtama();

}
