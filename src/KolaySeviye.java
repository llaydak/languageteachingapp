import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


//tek harf girilmeyen durumlar için exception fırlat
//

public class KolaySeviye extends SeviyeTesti{

    private final String[] sorular={"She ____ English twice a week."," I heard it ___ the radio.","'How ___ did you buy?' 'Three kilos.'","It's bigger ____ the old one.","You _____ drink and drive."};

    private final String[] secenekler={"A-study\n" +"B-studys\n" + "C-studeis\n" + "D-studies","A-in\n" +"B-at\n" + "C-on\n"+"D-above","A-much\n" +
            "B-many"+"C-more"+"D-most","A-much\n"+ "B-as\n" + "C-than\n" + "D-then","A-may\n" + "B-must\n" + "C-may not\n" + "D-must not"};
    private final String[] cevaplar= {"D","C","B","C","D"}; //dizilerde soru ve cevaplar değiştirilmemeli, bu yüzden final
    public int skor;

    @Override
    void seviyeAtama() {
        Scanner scanner = new Scanner(System.in);
        int sayi=testiBaslat();
        if (sayi<4){
            System.out.println("Tebrikler! Seviye belirleme testini başarıyla tamamladınız.");
            System.out.println("Şu anki İngilizce seviyeniz: Beginner!");
            System.out.println("Seviyenize uygun etkinlikler ile bir sonraki seviyeye daha hızlı ulaşacaksınız.");
            System.out.println("3 saniye sonra egzersizler gelecek....");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            KolaySeviyeExercises kolaySeviyeExercises = new KolaySeviyeExercises();
            kolaySeviyeExercises.EslestirmeYap();
            kolaySeviyeExercises.BoslukDoldur();
            //menüye dönüp egzersiz çözmek istediğide önüne sadece başlangıç seviye alıştırmaları getirecek kod.
            //seviyeye uygun egzersizler farklı sınıflarla proje arkadaşım tarafından kodlandı.
        }else {
            OrtaSeviye ortatest=new OrtaSeviye();
            //ortatest.testiBaslat();// eğer kullanıcı belli bir skorun üstüne çıktıysa diğer seviye testi tetiklenir.
            ortatest.seviyeAtama();
        }
    }

    @Override
    int testiBaslat() {
        Scanner scanner = new Scanner(System.in);
        Date baslangic = new Date();
        int skor = 0;
        int sorusayaci = 0;
        while (sorusayaci < sorular.length) {
            System.out.println(sorular[sorusayaci]);
            System.out.println(secenekler[sorusayaci]);
            String userAnswer = scanner.next();
            try {
                if (userAnswer.length() > 1) {
                    throw new OneLetterException();
                }
            } catch (OneLetterException e) {
                continue;
            }
            if (userAnswer.equalsIgnoreCase(cevaplar[sorusayaci])) {
                skor++;
            }

            try{
                secenekGecerliligi(userAnswer);
            }catch (GecersizSecenekException e)
            {
                continue;
            }
            sorusayaci++;
        }
        Date bitis = new Date();
        long gecenSure = bitis.getTime() - baslangic.getTime();
        String gecenSureFormatli = sureFormat(gecenSure);

        System.out.println("Toplam geçen süre: " + gecenSureFormatli);

        return skor;
    }

    void secenekGecerliligi(String userAnswer) throws GecersizSecenekException
    {
        if (!userAnswer.matches("[A-Da-d]")) {
            throw new GecersizSecenekException();
        }
    }
    private String sureFormat(long milisaniye) {
        SimpleDateFormat formatdakikasaniye = new SimpleDateFormat("mm:ss");
        return formatdakikasaniye.format(new Date(milisaniye));
    }
    private String sureFormat(Date date) {
        SimpleDateFormat formatDakikaSaniye = new SimpleDateFormat("DD/MM/yyyy HH:mm:ss");
        return formatDakikaSaniye.format(date);

    }
}

