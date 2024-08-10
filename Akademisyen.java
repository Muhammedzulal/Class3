package Class3;

public class Akademisyen extends Calisan {
    String bolum, gorevler;
    String ders;

    public Akademisyen(String adSoyad, String eposta, String telefon, String bolum, String gorevler, String ders) {
        super(adSoyad, eposta, telefon);
        this.bolum = bolum;
        this.gorevler = gorevler;
        this.ders = ders;
    }

    public void derseGir() {
        System.out.println(this.adSoyad + " Derse girdi.");
    }
}
