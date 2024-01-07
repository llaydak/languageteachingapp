import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class OrtaSeviye extends SeviyeTesti {

    private final String[] sorular = {"The river ______ (flow) very quickly today, much faster than usual.", " She lives ____", "It was ____ hot to drink", "I'll look it ___ in the dictionary", "If I'd been there, I _____ that"};
    private final String[] secenekler = {"A-is flowing\n" + "B-flew\n" + "C-flows\n" + "D-flowed", "A-alone\n" + "B-own\n" + "C-her own\n" + "D-lonely", "A-so\n" + "B-such\n" + "C-too\n" + "D-very", "A-on\n" + "B-at\n" + "C-to\n" + "D-up", "A-wouldn't do\n" + "B-wouldn't have done\n" + "C-will do\n" + "D-am doing"};
    private final String[] cevaplar = {"A", "A", "C", "D", "B"}; //dizilerde soru ve cevaplar değiştirilmemeli, bu yüzden final
    public int skor;

    @Override
    int testiBaslat() {
        Scanner scanner = new Scanner(System.in);
        Date baslangic = new Date();
        int skor = 0;
        int sorusayaci = 0;
        while (sorusayaci < sorular.length) {
            System.out.println(sorular[sorusayaci]);
            System.out.println(secenekler[sorusayaci]);
            String userAnswer = scanner.nextLine();
            try {
                if (userAnswer.length() > 1) {
                    throw new OneLetterException();
                }
            } catch (OneLetterException e) {
                System.err.println("Hata: " + e.getMessage());
            }
            if (userAnswer.equalsIgnoreCase(cevaplar[sorusayaci])) {
                skor++;
            }
            try {
                secenekGecerliligi(userAnswer);
            } catch (GecersizSecenekException e) {
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


    @Override
    void seviyeAtama() {
        int sayi = testiBaslat();
        if (sayi < 5) {
            System.out.println("Tebrikler! Seviye belirleme testinde iyi bir iş çıkardınız.");
            System.out.println("Şu anki İngilizce seviyeniz: Intermediate!");
            System.out.println("Seviyenize uygun etkinlikler ile bir sonraki seviyeye daha hızlı ulaşacaksınız.");
            System.out.println("Egzersizler 3 saniye sonra ekranda olacak...\n\n");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            OrtaSeviyeExercises ortaSeviyeExercises = new OrtaSeviyeExercises();
            ortaSeviyeExercises.BoslukDoldur();
            ortaSeviyeExercises.EslestirmeYap();
        } else {
            ZorSeviye zortest = new ZorSeviye();
            zortest.seviyeAtama();
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

    void secenekGecerliligi(String userAnswer) throws GecersizSecenekException {
        if (!userAnswer.matches("[A-Da-d]")) {
            throw new GecersizSecenekException();
        }
    }


}
