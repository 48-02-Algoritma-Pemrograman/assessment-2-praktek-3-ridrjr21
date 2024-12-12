import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int hampers = input.nextInt();
        int packing = input.nextInt();
        /* Pekerjaan anda mulai dari sini */
    public static int Total(ArrayList <String> orders) {
        int total = 0;
        for (int price : orders) {
            total += price;
        }
        return total;
    }

    
    public static int TotalDenganPajak(int total) {
        return total + (total * 0.1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String[] hampersMenu = {
            "1. 2 Kue Kering dan 3 Kue Basah - 150000",
            "2. 3 Kue Kering dan 2 Kue Basah - 175000",
            "3. 3 Kue Kering dan 3 Kue Basah - 200000"
        };
        int [] hampersHarga = {150000, 175000, 200000};

       
        String[] Menu = {
            "1. Pita - 50000",
            "2. Kartu - 75000",
            "3. Pita + Kartu - 125000"
        };
        int [] packingHarga = {50000, 75000, 125000};

        ArrayList<String> orders = new ArrayList<>();
        boolean Pesanan = true;

        
        while (Pesanan) {
            System.out.println("\nMenu Hampers:");
            for (String menu : hampersMenu) {
                System.out.println(menu);
            }

            System.out.print("Masukkan pilihan hampers [1/2/3]: ");
            int pilihHampers = scanner.nextInt();

            System.out.println("\nMenu Packing:");
            for (String menu : packingMenu) {
                System.out.println(menu);
            }

            System.out.print("Masukkan pilihan packing [1/2/3]: ");
            int packing = scanner.nextInt();

            
            double HampersHarga = hampersHarga[pilihHampers- 1];
            double packingHarga = packingHarga [packing - 1];
            orders.add(HampersHarga + packingHarga);

           
            System.out.print("Input lagi (Y/N)?: ");

        
        double total = Total(orders);
        double TotalDenganPajak = TotalDenganPajak(0);
        
        System.out.println("\nTotal hampers yang dipesan = " + orders.size());
        System.out.printf("Total yang harus dibayar = %.2f\n", TotalDenganPajak);

        scanner.close();
    }

        /* Pekerjaan anda berakhir sini */

        System.out.println(Nomor2.class.getDeclaredMethods().length); 
    }
}
