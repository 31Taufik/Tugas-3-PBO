
import java.util.Scanner;



class helloWorld {
    public static void main(String[] args) {

        int pilihan;

        System.out.println("");
        System.out.println("=======================================");
        System.out.println("         Kalkulator zakat Maal");


        do {
            
        System.out.println("=======================================");
        System.out.println("");

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah uang: Rp.");
        double uang = input.nextDouble();

        if (uang >= 6859394){
            double persen = 2.5 / 100;
            double hasil = uang * persen;
            System.out.print("Hasil: Rp.");
            System.out.println(String.format("%,.0f", hasil));
            System.out.println("");
        } else {
            System.out.println("Anda tidak wajib membayar zakat");
        }

        System.out.println("=========================================");
        System.out.println(" ");
        System.out.println("1. Hitung lagi");
        System.out.println("2. Selesai");
        System.out.print("Masukan Pilihan Anda: ");
        pilihan = input.nextInt();

        } while ( pilihan == 1 );

        System.out.println(" ");
        System.out.println("=============== BATAS SUCI ===============");

        System.out.println(" ");
		System.out.println("            PROGRAM CREATED BY");
		System.out.println("          MUHAMMAD TAUFIK HIDAYAT");
		System.out.println("                 23533739");
		System.out.println(" ");

    }
}