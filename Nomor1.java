import java.util.Scanner;

public class Nomor1 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        /* Pekerjaan anda mulai dari sini */
        static double N (int alas, int tinggi) {
        return 0.5 * alas * tinggi;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      System.out.print("Masukkan alas segitiga: "); 
      int alas = scanner.nextInt();

      System.out.print("Masukkan tinggi segitiga: ");
      int tinggi = scanner.nextInt();

      double N = N(alas, tinggi);

      System.out.println("Luas segitiga adalah: %.2f\n" + N);

        scanner.close();
    }
        /* Pekerjaan anda berakhir sini */

        System.out.println(Nomor1.class.getDeclaredMethods().length); 
    }
    
}
