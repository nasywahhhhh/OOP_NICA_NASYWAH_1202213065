public class MainApp {
    public static void main (String[] args) throws Exception {
        Perangkat pkt = new Perangkat("Adata",2, 1.80f);
        pkt.informasi();
        System.out.println("");
        
        Laptop lp = new Laptop("Seagate", 8, 2.40f, true);
        lp.informasi();
        lp.bukaGame("Dota 2");
        lp.kirimEmail("nanas@gmail.com");
        lp.kirimEmail("yuhu@gmail.com","maafyah@gmail.com");
        System.out.println("");

        Handphone hp = new Handphone ("Sandisk",3, 2.20f, false);
        hp.informasi();
        hp.telfon(62812345);
        hp.kirimSMS(62867890);
        hp.kirimSMS(62813579, 62824680);
        System.out.println();
   }
}