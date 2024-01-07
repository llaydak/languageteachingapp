import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sozluk {
    Scanner scan = new Scanner(System.in);
    int secenek;

    // Kullanıcıdan seçenek almak için bir metod
    public void sec() {
        System.out.println("Fiil türünde kelimeleri ve anlamlarını görmek için 1'i tuşlayınız! ");
        System.out.println("İsim türünde kelimeleri ve anlamlarını görmek istiyorsanız 2'yi tuşlayınız!");
        secenek = scan.nextInt();
    }

    private HashMap<String, Kelime> ingilizcedenTurkceye;
    //HashMap, İngilizce kelimelerin Türkçe karşılıklarını ve türlerini saklamak için kullanılıyor.
    // HashMap, anahtar-değer çiftleriyle çalışan bir veri yapısıdır. Burada anahtar, İngilizce kelimeyi temsil ederken, değer ise Türkçe çevirisi ve türü (fiil veya isim) olan nesneleri (Kelime sınıfı nesneleri) temsil ediyor.

    // Constructor (Yapıcı metod) ile HashMap oluşturma
    public Sozluk() {
        ingilizcedenTurkceye = new HashMap<>();
    }

    String ingilizceKelime, turkceCeviri, tur;

    // Anahtar ve değerleri ekleme metodları
    public void ceviri(String ingilizceKelime, String turkceCeviri, String tur) {
        Kelime kelime = new Kelime(turkceCeviri, tur);
        ingilizcedenTurkceye.put(ingilizceKelime, kelime);
    }

    // İngilizce kelimeye göre çeviri almak için metod
    public Kelime ceviriAl(String ingilizceKelime) {
        return ingilizcedenTurkceye.get(ingilizceKelime);
    }

    // Kullanıcı seçeneğine göre kelimeleri eklemek için metod
    public void turler() {
        switch (secenek) {
            case 1:
                ceviri("Run", "Koşmak", "fiil");
                ceviri("Accept", "Kabul etmek", "fiil");
                ceviri("Bite", "Isırmak", "fiil");
                ceviri("Do", "Yapmak", "fiil");
                ceviri("Expect", "Ümit Etmek, Beklemek", "fiil");
                ceviri("Explain", "Açıklamak", "fiil");
                ceviri("Desire", "Arzulamak", "fiil");
                ceviri("Forgive", "Affetmek", "fiil");
                ceviri("Collapsse", "Yıkılmak", "fiil");
                ceviri("Appeal", "Başvurmak", "fiil");
                ceviri("Approve", "Onaylamak", "fiil");
                ceviri("Freeze", "Donmak", "fiil");
                ceviri("Guard", "Korumak", "fiil");
                ceviri("Measure", "Ölçmek", "fiil");
                ceviri("Notice", "Fark etmek", "fiil");
                ceviri("Release", "Serbest bırakmak", "fiil");
                ekranaBasFiil();
                break;

            case 2:
                ceviri("Access", " Erişim, ulaşım", "isim");
                ceviri("Achievement", "Başarı", "isim");
                ceviri("Admission", "Kabul", "isim");
                ceviri("Country", "Ülke", "isim");
                ceviri("Education", "Eğitim", "isim");
                ceviri("Immigrate", "Göç etmek", "isim");
                ceviri("Archery", "Okçuluk", "isim");
                ceviri("History", "Tarih", "isim");
                ceviri("Competition", "Rekabet", "isim");
                ceviri("Target", "Hedef", "isim");
                ekranaBasİsim();
                break;
        }
    }

    // Fiil listesini ekrana basmak için metod
    public void ekranaBasFiil() {
        System.out.println("FİİL LİSTESİ");

        for (Map.Entry<String, Kelime> entry : ingilizcedenTurkceye.entrySet()) {
            String ingilizceKelime = entry.getKey();
            Kelime kelime = entry.getValue();
            System.out.println("İngilizce: " + ingilizceKelime +
                    " - Türkçe Çeviri ve Tür: " + kelime);
        }
    }

    // İsim listesini ekrana basmak için metod
    public void ekranaBasİsim() {
        System.out.println("İSİM LİSTESİ");

        for (Map.Entry<String, Kelime> entry : ingilizcedenTurkceye.entrySet()) {
            String ingilizceKelime = entry.getKey();
            Kelime kelime2 = entry.getValue();
            System.out.println("İngilizce: " + ingilizceKelime +
                    " - Türkçe Çeviri ve Tür: " + kelime2);
        }
    }
}