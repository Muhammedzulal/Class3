package Class3;

public class Guvenlik extends Memurlar {
    String belge;

    public Guvenlik(String adSoyad, String eposta, String telefon, String mesai, String departman, String belge) {
        super(adSoyad, eposta, telefon, mesai, departman);
        this.belge = belge;
    }

}
