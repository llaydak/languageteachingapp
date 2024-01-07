import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ZorSeviye extends SeviyeTesti {

    private final String[] sorular = {"I saw her just _____ day.", " This is the town ____ I was born in", "___ a matter of fact, I did finish it on time.", " I spent twenty minutes ___ the test", "The negative of 'noble is ___"};

    private final String[] secenekler = {"A-another\n" + "B-other\n" + "C-the other\n" + "D-all", "A-where\n" + "B-when\n" + "C-which\n" + "D-who", "A-As\n" + "B-Like\n" + "C-Alike\n" + "D-In", "A-do\n" + "B-to do\n" + "C-doing\n" + "D-did", "A-innoble\n" + "B-unnoble\n" + "C-ignoble\n" + "D-disnoble"};
    private final String[] cevaplar = {"C", "A", "A", "C", "C"}; //dizilerde soru ve cevaplar değiştirilmemeli, bu yüzden final
    public int skor;

    @Override
    int testiBaslat() {
        Scanner scanner = new Scanner(System.in);
        Date baslangic = new Date();
        while (sorusayaci < sorular.length) {
            System.out.println(sorular[sorusayaci]);
            System.out.println(secenekler[sorusayaci]);
            String userAnswer = scanner.nextLine();

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

    @Override
    void seviyeAtama() {
        int sayi = testiBaslat();
        if (sayi < 3) {
            System.out.println("Tebrikler! Seviye belirleme testinin üstesinden çok iyi geldiniz!");
            System.out.println("Şu anki İngilizce seviyeniz: Advanced!");
            System.out.println("Seviyenize uygun etkinlikler ile kendinizi formda tutun.");
            System.out.println("Egzersizler 3 saniye sonra ekranda olacak...\n\n");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            ZorSeviyeExercises zorSeviyeExercises = new ZorSeviyeExercises();
            zorSeviyeExercises.BoslukDoldur();
            zorSeviyeExercises.EslestirmeYap();
        } else {
            System.out.println("Olağanüstü! Seviye belirleme testini mükemmel şekilde tamamladınız.");
            System.out.println("İngilizce seviyeniz Advanced olarak belirlendi, ve buraya çok iyi bir skorla vardınız!");
            System.out.println("İşleyen demir pas tutmaz derler, bu nedenle size özel vereceğimiz son sınıf egzersizlerle");
            System.out.println("Tekrar etmeye ve formda kalmaya devam edin!");
            System.out.println("Sorular 3 saniye sonra ekranda olacak...\n\n");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            ZorSeviyeExercises zorSeviyeExercises = new ZorSeviyeExercises();
            zorSeviyeExercises.BoslukDoldur();
            zorSeviyeExercises.EslestirmeYap();
            zorSeviyeExercises.BoslukDoldurMaster();


        }
    }
}