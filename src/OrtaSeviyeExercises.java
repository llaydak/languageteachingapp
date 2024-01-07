
import java.util.Scanner;

public class OrtaSeviyeExercises implements Exercises {

        @Override
        public void BoslukDoldur() {

        String[] doldurmaCevaplar = BoslukDoldurma();

        for (int i = 0; i < doldurmaCevaplar.length; i++) {
            System.out.print((i + 1) + "." + " = ");
            String cevap = new Scanner(System.in).nextLine();
            doldurmaCevaplar[i] = cevap;
        }
            String[] dogruDoldurmaCevaplar = {"spent", "aware", "began", "contacted", "considered"};
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

    @Override
    public void EslestirmeYap() {

        System.out.println("Orta seviye soruları:\n");
        String[] eslestirmeCevaplar = Eslestirme();

        // Esleştirme egzersizi için soruları yaz ve yanıtları al
        for (int i = 0; i < eslestirmeCevaplar.length; i++) {
            System.out.print(eslestirmeCevaplar[i] + " = ");
            String cevap = new Scanner(System.in).nextLine();
            eslestirmeCevaplar[i] = cevap;
        }
        String[] dogruEslestirmeCevaplar = {"Tartış", "Gelecek", "Ada", "Hazırla", "Cenaze", "Hedef", "Sır","Sorumlu"};
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


        String[] eslestirmeSorulari = {"Argue", "Future", "Island", "Prepare", "Funeral", "Target", "Secret", "Responsible"};
        return eslestirmeSorulari;
    }

    String[] BoslukDoldurma() {
        System.out.println("Boşlukları - spent/ aware/ began/ contacted/ considered - kelimeleri ile doldurunuz.\n");
        System.out.println("A few decades ago, professional footballers ------ their nights partying.");
        System.out.println("Now, they are much more ----- of the benefits of a good night’s sleep.");
        System.out.println("The change ----- in the mid-1990s");
        System.out.println("When mattress salesman Nick Littlehales ------- the manager of the Manchester United football team");
        System.out.println("Alex Ferguson, asking whether he had ever ------- how sleep affected performance on the pitch.\n\n");


        String[] doldurmaSorulari = {"spent", "are", "began", "contacted", "considered"};
        return doldurmaSorulari;
    }
}

