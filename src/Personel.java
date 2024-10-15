public class Personel {
    private String ad;
    private String pozisyon;
    private double gunlukMaas;
    private int calisilanGun;

    //constructor
    public Personel(String ad, String pozisyon, double gunlukMaas) {
        this.ad = ad;
        this.pozisyon = pozisyon;
        this.gunlukMaas = gunlukMaas;
    }

    // Çalışılan gün sayısını ayarla
    public void setCalisilanGun(int calisilanGun) {
        this.calisilanGun = calisilanGun;
    }

    // Maaş ve prim hesaplama metodu
    public double maasHesapla() {
        double maas = gunlukMaas * calisilanGun;
        //çalışılan gün sayısı 25'ten fazla ise ekstra prim ekle
        double prim = (calisilanGun > 25) ? (calisilanGun - 25) * 1000 : 0;
        return maas + prim;
    }

    // Toplam maaşı ve prim
    public void toplamMaas() {
        System.out.println(ad + ":" + maasHesapla());
    }
}
