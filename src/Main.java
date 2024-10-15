public class Main {
    public static void main(String[] args) {
        // Personel nesnesi
        Personel personel = new Personel("amine", "finans müdürü", 3000);
        Personel personel1 =new Personel("tuba","muhendis",500);
        // Çalışılan günü belirle
        personel.setCalisilanGun(26);
        personel.toplamMaas();

        personel1.setCalisilanGun(24);
        personel1.toplamMaas();
    }
}
