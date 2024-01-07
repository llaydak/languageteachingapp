
import java.util.Scanner;

public class KolaySeviyeExercises implements Exercises {

    @Override
    public void BoslukDoldur() {

        String[] doldurmaCevaplar = BoslukDoldurma();

        for (int i = 0; i < doldurmaCevaplar.length; i++) {
            System.out.print((i + 1) + "." + " = ");
            String cevap = new Scanner(System.in).nextLine();
            doldurmaCevaplar[i] = cevap;
        }

        String[] dogruDoldurmaCevaplar = {"comes", "is", "is", "has", "drives", "flies", "takes"};

        for (int i = 0; i < doldurmaCevaplar.length; i++) {
            {
                if (doldurmaCevaplar[i].equals(dogruDoldurmaCevaplar[i])) {
                    System.out.println("Boşluk doldurma sorusu " + (i + 1) + "." + " doğru!");
                } else {
                    System.out.println("Bosluk doldurma sorusu " + (i + 1) + " yanlış! Doğru cevap: " + dogruDoldurmaCevaplar[i]);
                }
            }
        }


    }

    public void EslestirmeYap() {
        System.out.println("Kolay seviye soruları:\n");
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
                System.out.println("Eşleştirme sorusu " + (i + 1) + " doğru!");
            } else {
                System.out.println("Eşleştirme sorusu " + (i + 1) + " yanlış! Doğru cevap: " + dogruEslestirmeCevaplar[i]);
            }
        }

    }
    String[] Eslestirme() {
        System.out.println("Kelimelerin Türkçe karşılıklarını ekrana yazınız:\n");

        String[] eslestirmeSorulari = {"Cat", "Buy", "Alone", "Airplane", "Monday"};
        return eslestirmeSorulari;
    }

    String[] BoslukDoldurma() {
        System.out.println("Boşlukları -  be/ drive/ take/ be/ have/ fly/ come - kelimeleri ile doldurunuz\n");
        System.out.println("Susie ------- from Canada but she lives in Italy.");
        System.out.println("She ----- married to an Italian, Ronaldo.");
        System.out.println("He ------ an interpreter and works for a newspaper.");
        System.out.println("She -- lunch at 12 o’clock every day.");
        System.out.println("She ----- her car from home to work.");
        System.out.println("Ronaldo ----- his plane from Rome to Venice.");
        System.out.println("His journey ----- 45 minutes.");

        String[] doldurmaSorulari = {"comes", "is", "is", "has", "drives", "flies", "takes"};
        return doldurmaSorulari;
    }
}

