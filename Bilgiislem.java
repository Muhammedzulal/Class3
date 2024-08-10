package Class3;

public class Bilgiislem extends Memurlar {
    String gorev;

    public Bilgiislem(String adSoyad, String eposta, String telefon, String mesai, String departman, String gorev) {
        super(adSoyad, eposta, telefon, mesai, departman);
        this.gorev = gorev;
    }

}
