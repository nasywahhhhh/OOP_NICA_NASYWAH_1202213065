import java.util.Scanner;

class Database {
    Scanner keyboard = new Scanner(System.in);
    String input;

    void show_menu() {
        System.out.println("=================================");
        System.out.println("1. Menu");
        System.out.println("2. Pilih Menu");
        System.out.println("3. Keluar");
        System.out.println("=================================");

    }

    String insert_menu() {
        System.out.print("Masukkan Pilihan : ");
        input = keyboard.nextLine();

        return input;

    }

    void Search(String search) {
        switch (search) {
            case "Bakso":
                System.out.println("1. Bakso (Makanan) Rp. 10000");
                break;
            case "Es Teh":
                System.out.println("2. Es Teh (Minuman) Rp. 5000");
                break;
            case "Brownies":
                System.out.println("3. Brownies (Dessert) Rp. 15000");
                break;
            default:

        }

    }
} 

public class Main{
    public static void main(String[]args) {
        String name, no_hp;
        String cari;

        Scanner keyboard = new Scanner(System.in);
        Database dbase = new Database();

        System.out.println("Selamat datang di restoran EAD");
        System.out.println("Silahkan Register Terlebih Dahulu");
        System.out.println("=================================");
        System.out.print("Nama : ");

        name = keyboard.nextLine();

        System.out.print("No. Handphone : ");

        no_hp = keyboard.nextLine();

        System.out.print("\n");
        System.out.println("Register Succcess");
        System.out.println("Nama : " + name);
        System.out.println("Phone Number : " + no_hp);
        do {
            dbase.show_menu();
            
            switch (dbase.insert_menu()) {
                case "1":
                    System.out.println("Menu");
                    System.out.println("=================================");
                    System.out.println("1. Bakso (Makanan) Rp. 10000\n");
                    System.out.println("2. Es Teh (Minuman) Rp. 5000\n");
                    System.out.println("3. Brownies (Dessert) Rp. 15000\n");
                    
                    break;
                case "2":
                    System.out.print("Masukkan Nama Menu : ");
                    cari = keyboard.nextLine();
                    System.out.println("Hasil Pencarian : " + cari);
                    System.out.println("=================================");
                    dbase.Search(cari);

                    break;

                case "3":
                    System.out.println("Terima Kasih");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak ada !");

            }
            
        } while (1<10);

    }

}
   