
import java.util.Scanner;

public class KolaySeviyeExercises implements Exercises {

    @Override
    public void BoslukDoldur() {

        String[] doldurmaCevaplar = BoslukDoldurma();

        // BoslukDoldurma alıştırması için soruları görüntüleyin ve yanıtları alın
        for (int i = 0; i < doldurmaCevaplar.length; i++) {
            System.out.print((i + 1) + "." + " = ");
            String cevap = new Scanner(System.in).nextLine();
            doldurmaCevaplar[i] = cevap;
        }

        String[] dogruDoldurmaCevaplar = {"is", "oldu", "beğenir", "beğenir", "sürer", "uçar", "alır"};

        for (int i = 0; i < doldurmaCevaplar.length; i++) {
            {
                if (doldurmaCevaplar[i].equals(dogruDoldurmaCevaplar[i])) {
                    System.out.println("BoslukDoldurma Sorusu " + (i + 1) + "." + " doğru!");
                } else {
                    System.out.println("BoslukDoldurma Sorusu " + (i + 1) + " yanlış! Doğru cevap: " + dogruDoldurmaCevaplar[i]);
                }
            }
        }


    }
    // Doğru cevaplarla karşılaştırma yapın
    //   compareAnswers(eslestirmeCevaplar, doldurmaCevaplar);


    public void EslestirmeYap() {
        System.out.println("Kolay seviye soruları:");
        String[] eslestirmeCevaplar = Eslestirme();

        // Esleştirme egzersizi için soruları yaz ve yanıtları al
        for (int i = 0; i < eslestirmeCevaplar.length; i++) {
            System.out.print(eslestirmeCevaplar[i] + " = ");
            String cevap = new Scanner(System.in).nextLine();
            eslestirmeCevaplar[i] = cevap;
        }
        String[] dogruEslestirmeCevaplar = {"Kedi", "Satın al", "Yalnız", "Uçak", "Pazartesi"};
        for (int i = 0; i < eslestirmeCevaplar.length; i++) {
            if (eslestirmeCevaplar[i].equalsIgnoreCase(dogruEslestirmeCevaplar[i])) {
                System.out.println("Eslestirme Sorusu " + (i + 1) + " doğru!");
            } else {
                System.out.println("Eslestirme Sorusu " + (i + 1) + " yanlış! Doğru cevap: " + dogruEslestirmeCevaplar[i]);
            }
        }

    }

  //  void compareAnswers(String[] eslestirmeCevaplar, String[] doldurmaCevaplar) {
        // Doğru cevaplar burada olacak
        // String[] dogruEslestirmeCevaplar = {"Kedi", "Satın al", "Yalnız", "Uçak", "Pazartesi"};
       // String[] dogruDoldurmaCevaplar = {"is", "oldu", "beğenir", "beğenir", "sürer", "uçar", "alır"};

        // Esleştirme egzersizi için doğru cevapları kontrol et
    /*    for (int i = 0; i < eslestirmeCevaplar.length; i++) {
            if (eslestirmeCevaplar[i].equalsIgnoreCase(dogruEslestirmeCevaplar[i])) {
                System.out.println("Eslestirme Sorusu " + (i + 1) + " doğru!");
            } else {
                System.out.println("Eslestirme Sorusu " + (i + 1) + " yanlış! Doğru cevap: " + dogruEslestirmeCevaplar[i]);
            }
        }*/

        // BoslukDoldurma alıştırması için doğru cevapları kontrol et
       /* for (int i = 0; i < doldurmaCevaplar.length; i++) {
            {
                if (doldurmaCevaplar[i].equals(dogruDoldurmaCevaplar[i])) {
                    System.out.println("BoslukDoldurma Sorusu " + (i + 1) + "." + " doğru!");
                } else {
                    System.out.println("BoslukDoldurma Sorusu " + (i + 1) + " yanlış! Doğru cevap: " + dogruDoldurmaCevaplar[i]);
                }
            }
        }
    }*/


    String[] Eslestirme() {
        System.out.println("Kelimelerin Türkçe karşılıklarını ekrana yazınız:");
       /* System.out.println("Cat =");
        System.out.println("Buy =");
        System.out.println("Alone =");
        System.out.println("Airplane =");
        System.out.println("Monday =");*/

        String[] eslestirmeSorulari = {"Cat", "Buy", "Alone", "Airplane", "Monday"};
        return eslestirmeSorulari;
    }

    String[] BoslukDoldurma() {
        System.out.println("Boşlukları play, come, be, be, cost, drive, take, have, fly, live, work, like kelimeleri ile doldurunuz");
        System.out.println("Susie ------- from Canada but she lives in Italy.");
        System.out.println("She ----- married to an Italian, Ronaldo.");
        System.out.println("He ------ an interpreter and works for a newspaper.");
        System.out.println("She -- lunch at 12 o’clock every day.");
        System.out.println("She ----- her car from home to work.");
        System.out.println("Ronaldo ----- his plane from Rome to Venice.");
        System.out.println("His journey ----- 45 minutes.");

        String[] doldurmaSorulari = {"is", "is", "is", "likes", "drives", "flies", "takes"};
        return doldurmaSorulari;
    }
}

