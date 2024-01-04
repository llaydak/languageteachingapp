import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        KullaniciYonetimi kullaniciYonetimi = new KullaniciYonetimi();
        kullaniciYonetimi.girisAl();


        boolean devam = true;
        while (devam) {
            System.out.println("Sözlüğe ulaşmak için 1 \n Seviye testine ulaşmak için 2 \n Egzersizlere ulaşmak için 3 \n uygulamadan ayrılmak için 4'ü tuşlayınız.");

            Scanner scan = new Scanner(System.in);

            int secme;
            secme = scan.nextInt();

            switch (secme) {
                case 1:
                    Sozluk sozluk = new Sozluk();
                    sozluk.sec();
                    sozluk.turler();
                    System.out.println("Menüye dönmek için 1 'e basınız");
                    int donus = scan.nextInt();
                    if (donus == 1)
                        break;

                case 2:
                    KolaySeviye testbaslangic = new KolaySeviye();
                    testbaslangic.seviyeAtama();
                    System.out.println("Menüye dönmek için 1 'e basınız");
                    donus = scan.nextInt();
                    if (donus == 1)
                        break;

                case 3:
                    int secme3;
                    System.out.println("Ulaşmak istediğiniz egzersizi seçiniz.\n 1=Kolay seviye\n 2=Orta Seviye \n 3= Zor Seviye");
                    secme3 = scan.nextInt();
                    switch (secme3) {
                        case 1:
                            KolaySeviyeExercises kolayExercises = new KolaySeviyeExercises();
                            kolayExercises.EslestirmeYap();
                            kolayExercises.BoslukDoldur();
                            break;
                        case 2:
                            OrtaSeviyeExercises ortaExercises = new OrtaSeviyeExercises();
                            ortaExercises.EslestirmeYap();
                            ortaExercises.BoslukDoldur();

                            break;

                        case 3:
                           ZorSeviyeExercises exercises3 = new ZorSeviyeExercises();
                            exercises3.EslestirmeYap();
                            exercises3.BoslukDoldur();
                            break;
                    }
                    System.out.println("Menüye dönmek için 1 'e basınız");
                    donus = scan.nextInt();
                    if(donus==1)
                        break;
                case 4:
                    devam = false;
                    break;
                    }
            }


        }
    }
