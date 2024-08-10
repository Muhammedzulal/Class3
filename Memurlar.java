package Class3;

public class Memurlar extends Calisan {
    String mesai, departman;

    public Memurlar(String adSoyad, String eposta, String telefon, String mesai, String departman) {
        super(adSoyad, eposta, telefon);
        this.mesai = mesai;
        this.departman = departman;
    }

}
