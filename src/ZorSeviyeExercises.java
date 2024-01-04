import java.util.Scanner;

public class ZorSeviyeExercises implements Exercises {

    @Override
    public void BoslukDoldur() {

        String[] doldurmaCevaplar = BoslukDoldurma();


        // BoslukDoldurma alıştırması için soruları görüntüleyin ve yanıtları alın
        for (int i = 0; i < doldurmaCevaplar.length; i++) {
            System.out.print((i + 1) + "." + " = ");
            String cevap = new Scanner(System.in).nextLine();
            doldurmaCevaplar[i] = cevap;
        }
        String[] dogruDoldurmaCevaplar = {"spent", "are", "began", "contacted", "considered", "trying", "moved", "unpacked", "turned"};
        // BoslukDoldurma alıştırması için doğru cevapları kontrol et
        for (int i = 0; i < doldurmaCevaplar.length; i++) {
            {
                if (doldurmaCevaplar[i].equals(dogruDoldurmaCevaplar[i])) {
                    System.out.println("BoslukDoldurma Sorusu " + (i + 1) + "." + " doğru!");
                } else {
                    System.out.println("BoslukDoldurma Sorusu " + (i + 1) + " yanlış! Doğru cevap: " + dogruDoldurmaCevaplar[i]);
                }
            }
        }



        // Doğru cevaplarla karşılaştırma yapın
        // compareAnswers(eslestirmeCevaplar, doldurmaCevaplar);
    }

    @Override
    public void EslestirmeYap() {

        System.out.println("Zor seviye soruları:");
        String[] eslestirmeCevaplar = Eslestirme();

        // Esleştirme egzersizi için soruları yaz ve yanıtları al
        for (int i = 0; i < eslestirmeCevaplar.length; i++) {
            System.out.print(eslestirmeCevaplar[i] + " = ");
            String cevap = new Scanner(System.in).nextLine();
            eslestirmeCevaplar[i] = cevap;
        }
        String[] dogruEslestirmeCevaplar = {"Tartışmak", "Gelecek", "Ada", "Hazırlamak", "Cenaze", "Hedef", "Sır","Sotumlu"};
        // Esleştirme egzersizi için doğru cevapları kontrol et
        for (int i = 0; i < eslestirmeCevaplar.length; i++) {
            if (eslestirmeCevaplar[i].equalsIgnoreCase(dogruEslestirmeCevaplar[i])) {
                System.out.println("Eslestirme Sorusu " + (i + 1) + " doğru!");
            } else {
                System.out.println("Eslestirme Sorusu " + (i + 1) + " yanlış! Doğru cevap: " + dogruEslestirmeCevaplar[i]);
            }
        }
    }




    String[] Eslestirme() {
        System.out.println("Kelimelerin Türkçe karşılıklarını ekrana yazınız:");


        String[] eslestirmeSorulari =
                {"Contribution",
                "Disapprove",
                "Fundamental",
                "Rapid","Venture"};
        return eslestirmeSorulari;
        };



    String[] BoslukDoldurma() {
        System.out.println("devote, coverage, trace, assassinated,kelimeleri ile doldurunuz");
        System.out.println("The magazine then went on to ---- six full pages");
        System.out.println(" to the film and its background, unprecedented ------ for a film ");
        System.out.println("The film, which won no fewer than eight Oscars, ----- the life of Mahatma Gandhi");
        System.out.println("Gandhi was ----- in 1948, at the age of 78");


        String[] doldurmaSorulari = {"devote","coverage","trace","assasigned"};


        return doldurmaSorulari;
    }
}
