public class Kelime {
    private String kelime;
    private String tur;

    public Kelime(String kelime,String tur)
    {
        this.kelime=kelime;
        this.tur=tur;
    }

    public String getKelime() {
        return kelime;
    }

    public String getTur() {
        return tur;
    }

    public String toString()
    {
        return kelime + " ("  + tur + ")";
    }
}
