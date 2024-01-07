import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
public class KullaniciYonetimi {

    static boolean onay;

    public void girisAl()
    {
        Scanner scanner = new Scanner(System.in);

        dosyadanBilgileriOku();

        while (!onay) {
                System.out.println("1. Giriş Yap");
                System.out.println("2. Kayıt Ol");
                System.out.println("3. Çıkış");
                System.out.print("Seçiminiz: ");
                String secim =scanner.next();

                switch (secim) {
                    case "1":
                        girisYap(scanner);
                        break;
                    case "2":
                        kayitOl(scanner);
                        break;
                    case "3":
                        System.out.println("Çıkış yapılıyor...");
                        System.exit(0);

                    default:
                        System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
                }
            }
        }

    private static void girisYap(Scanner scanner) {
        System.out.print("Kullanıcı Adı: ");
        String kullaniciAdi = scanner.next();

        if (!KullaniciGirisi.kullaniciBilgileri.containsKey(kullaniciAdi)) {
            System.out.println("Bu kullanıcı adı kayıtlı değil. Lütfen kayıt olun.");
            return;
        }

        System.out.print("Şifre: ");
        String sifre = scanner.next();

        if (sifre.equals(KullaniciGirisi.kullaniciBilgileri.get(kullaniciAdi))) {
            System.out.println("Giriş başarılı!");

            onay=true;
        } else {
            System.out.println("Şifre yanlış. Lütfen tekrar deneyin.");
        }
    }

    static void dosyadanBilgileriOku()
    {
        try (BufferedReader reader = new BufferedReader(new FileReader(KullaniciGirisi.kullaniciBilgileri_dosyaAdi))) {
            String satir;
            while ((satir = reader.readLine()) != null)
            {
                String[] parcalar = satir.split(" "); //her satırı boşluk karakterini kullanarak parcalar halinde böler. Bunu split yöntemiyle yapar.
                if (parcalar.length == 2) //dizi uzunluğu 2 ise kullanıcı adı ve şifre var varsayar.
                {
                    String kullaniciAdi = parcalar[0];
                    String sifre = parcalar[1];
                    KullaniciGirisi.kullaniciBilgileri.put(kullaniciAdi, sifre);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void kayitOl(Scanner scanner) {
        System.out.print("Yeni Kullanıcı Adı: ");
        String yeniKullaniciAdi = scanner.next();

        if (KullaniciGirisi.kullaniciBilgileri.containsKey(yeniKullaniciAdi)) {
            System.out.println("Bu kullanıcı adı zaten kullanılıyor. Lütfen farklı bir kullanıcı adı seçin.");
            return;
        }

        System.out.print("Şifre: ");
        String yeniSifre = scanner.next();

        KullaniciGirisi.kullaniciBilgileri.put(yeniKullaniciAdi, yeniSifre);
        System.out.println("Kayıt başarılı!");

        try(BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\akdag\\OneDrive\\Masaüstü\\kullanicibilgileri.txt" +
                " " , true))){
            writer.write(yeniKullaniciAdi+ " " + yeniSifre);
            writer.newLine();
            writer.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        dosyadanBilgileriOku();
}

}
