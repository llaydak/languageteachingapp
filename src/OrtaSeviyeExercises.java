
import java.util.Scanner;

public class OrtaSeviyeExercises implements Exercises {

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

        System.out.println("Orta seviye soruları:");
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

    //void compareAnswers(String[] eslestirmeCevaplar, String[] doldurmaCevaplar) {
        // Doğru cevaplar burada olacak
       // String[] dogruEslestirmeCevaplar = {"Tartışmak", "Gelecek", "Ada", "Hazırlamak", "Cenaze", "Hedef", "Sır","Sotumlu"};
     //   String[] dogruDoldurmaCevaplar = {"spent", "are", "began", "contacted", "considered", "trying", "moved", "unpacked", "turned"};

        /* Esleştirme egzersizi için doğru cevapları kontrol et
        for (int i = 0; i < eslestirmeCevaplar.length; i++) {
            if (eslestirmeCevaplar[i].equalsIgnoreCase(dogruEslestirmeCevaplar[i])) {
                System.out.println("Eslestirme Sorusu " + (i + 1) + " doğru!");
            } else {
                System.out.println("Eslestirme Sorusu " + (i + 1) + " yanlış! Doğru cevap: " + dogruEslestirmeCevaplar[i]);
            }
        }*/

        /* BoslukDoldurma alıştırması için doğru cevapları kontrol et
        for (int i = 0; i < doldurmaCevaplar.length; i++) {
            {
                if (doldurmaCevaplar[i].equals(dogruDoldurmaCevaplar[i])) {
                    System.out.println("BoslukDoldurma Sorusu " + (i + 1) + "." + " doğru!");
                } else {
                    System.out.println("BoslukDoldurma Sorusu " + (i + 1) + " yanlış! Doğru cevap: " + dogruDoldurmaCevaplar[i]);
                }
            }
        }*/



    String[] Eslestirme() {
        System.out.println("Kelimelerin Türkçe karşılıklarını ekrana yazınız:");


        String[] eslestirmeSorulari = {"Argue", "Future", "Island", "Prepare", "Funeral", "Taregt", "Secret", "Responsible"};
        return eslestirmeSorulari;
    }

    String[] BoslukDoldurma() {
        System.out.println("Boşlukları spent,aware,began ,contacted.considered   kelimeleri ile doldurunuz");
        System.out.println("A few decades ago, professional footballers------ their nights partying. ");
        System.out.println("Now, they are much more-----of the benefits of a good night’s sleep.  ");
        System.out.println("The change-----in the mid-1990s");
        System.out.println("When mattress salesman Nick Littlehales ------- the manager of the Manchester United football team");
        System.out.println("Alex Ferguson, asking whether he had ever -------how sleep affected performance on the pitch. ");
        System.out.println("Boşlukları meaning,trying ,moving,unpacked,turned   kelimeleri ile doldurunuz");
        System.out.println("I've been------to write for ages ");
        System.out.println("Not that I'm-----to make excuses for myself, it's been really hard to sit down and write,");
        System.out.println("As I've been ----- around so much. ");
        System.out.println("Since we last saw each other I've ------- my bags in four different cities.  ");
        System.out.println("This job has -------out to be more of a whirlwind than I expected ");

        String[] doldurmaSorulari = {"spent", "are", "began", "contacted", "considered", "trying", "moved", "unpacked", "turned"};
        return doldurmaSorulari;
    }
}

