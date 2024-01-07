import java.util.Scanner;

public class ZorSeviyeExercises implements Exercises {

    @Override
    public void BoslukDoldur() {

        String[] doldurmaCevaplar = BoslukDoldurma();

        for (int i = 0; i < doldurmaCevaplar.length; i++) {
            System.out.print((i + 1) + "." + " = ");
            String cevap = new Scanner(System.in).nextLine();
            doldurmaCevaplar[i] = cevap;
        }
        String[] dogruDoldurmaCevaplar = {"devote", "coverage", "trace", "assassinated"};
        // BoslukDoldurma alıştırması için doğru cevapları kontrol et
        for (int i = 0; i < doldurmaCevaplar.length; i++) {
            {
                if (doldurmaCevaplar[i].equals(dogruDoldurmaCevaplar[i])) {
                    System.out.println("Boşluk doldurma sorusu " + (i + 1) + "." + " doğru!");
                } else {
                    System.out.println("Boşluk doldurma sorusu " + (i + 1) + " yanlış! Doğru cevap: " + dogruDoldurmaCevaplar[i]);
                }
            }
        }
    }

    public void BoslukDoldurMaster() {
        System.out.println("*** Master seviye özel egzersizi! Başarılar ***");

        String[] doldurmaCevaplar = BoslukDoldurmaMaster();

        for (int i = 0; i < doldurmaCevaplar.length; i++) {
            System.out.print((i + 1) + "." + " = ");
            String cevap = new Scanner(System.in).nextLine();
            doldurmaCevaplar[i] = cevap;
        }

        String[] dogruDoldurmaCevaplar = {"meaning", "trying", "moving", "unpacked", "turned"};

        for (int i = 0; i < doldurmaCevaplar.length; i++) {
            if (doldurmaCevaplar[i].equals(dogruDoldurmaCevaplar[i])) {
                System.out.println("Boşluk doldurma sorusu " + (i + 1) + "." + " doğru!");
            } else {
                System.out.println("Boşluk doldurma sorusu " + (i + 1) + " yanlış! Doğru cevap: " + dogruDoldurmaCevaplar[i]);
            }
        }
    }

    @Override
    public void EslestirmeYap() {

        //System.out.println("Zor seviye soruları:\n");
        String[] eslestirmeCevaplar = Eslestirme();

        // Esleştirme egzersizi için soruları yaz ve yanıtları al
        for (int i = 0; i < eslestirmeCevaplar.length; i++) {
            System.out.print(eslestirmeCevaplar[i] + " = ");
            String cevap = new Scanner(System.in).nextLine();
            eslestirmeCevaplar[i] = cevap;
        }
        String[] dogruEslestirmeCevaplar = {"Katkı", "Onaylamamak", "Temel", "Hızlı", "Girişim"};
        // Esleştirme egzersizi için doğru cevapları kontrol et
        for (int i = 0; i < eslestirmeCevaplar.length; i++) {
            if (eslestirmeCevaplar[i].equalsIgnoreCase(dogruEslestirmeCevaplar[i])) {
                System.out.println("Eşleştirme sorusu " + (i + 1) + " doğru!");
            } else {
                System.out.println("Eşleştirme sorusu " + (i + 1) + " yanlış! Doğru cevap: " + dogruEslestirmeCevaplar[i]);
            }
        }
    }


    String[] Eslestirme() {
        System.out.println("Kelimelerin Türkçe karşılıklarını ekrana yazınız:\n");


        String[] eslestirmeSorulari =
                {"Contribution", "Disapprove", "Fundamental", "Rapid", "Venture"};
        return eslestirmeSorulari;
    }

    ;


    String[] BoslukDoldurma() {
        System.out.println("Boşlukları - devote/ coverage/ trace/ assassinated - kelimeleri ile doldurunuz.\n");
        System.out.println("The magazine then went on to ---- six full pages");
        System.out.println("to the film and its background, unprecedented ------ for a film.");
        System.out.println("The film, which won no fewer than eight Oscars, ----- the life of Mahatma Gandhi.");
        System.out.println("Gandhi was ----- in 1948, at the age of 78.");


        String[] doldurmaSorulari = {"devote", "coverage", "trace", "assassinated"};


        return doldurmaSorulari;
    }

    String[] BoslukDoldurmaMaster() {
        System.out.println("Boşlukları - meaning/ trying/ moving/ unpacked/ turned - kelimeleri ile doldurunuz");
        System.out.println("I've been ------ to write for ages.");
        System.out.println("Not that I'm ----- to make excuses for myself, it's been really hard to sit down and write");
        System.out.println("As I've been ----- around so much. ");
        System.out.println("Since we last saw each other I've ------- my bags in four different cities.");
        System.out.println("This job has ------- out to be more of a whirlwind than I expected.");

        String[] doldurmaSorulari = {"meaning","trying", "moving", "unpacked", "turned"};
        return doldurmaSorulari;
    }
}