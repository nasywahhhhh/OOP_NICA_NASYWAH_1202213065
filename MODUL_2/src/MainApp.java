public class MainApp {
    public static void main(String[] args) throws Exception {
        TransportasiAir trair = new TransportasiAir(7, 15000);
        trair.informasi();
        trair.berlayar();
        trair.berlabuh();
        System.out.println("");

        Sampan sampanku = new Sampan(5, 5000, 0);
        sampanku.informasi();
        sampanku.berlayar();
        sampanku.berlabuh();
        sampanku.berlabuh(1);
        System.out.println("");
        
        Kapal kapalku = new Kapal(20, 30000, "Nuklir");
        kapalku.informasi();
        kapalku.berlayar();
        kapalku.berlayar(20);
        kapalku.berlabuh();
    }
}
