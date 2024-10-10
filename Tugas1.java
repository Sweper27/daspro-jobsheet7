import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahTiket, hargaTiket=50000, totalTiketTerjual = 0;
        double totalHarga = 0, diskon = 0, subtotal ;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (atau ketik 0 untuk keluar): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                break;
            }
            if (jumlahTiket < 0) {
                System.out.println("input yang dimasukkan tidak valid, silahkan coba lagi. ");
            }
            if (jumlahTiket > 10 ) {
                diskon = 0.15;
            }else if (jumlahTiket > 4){
                diskon = 0.10;
            }
            
            subtotal = jumlahTiket * hargaTiket;
            totalHarga += subtotal - (subtotal * diskon);
            totalTiketTerjual += jumlahTiket;

            System.out.println("Total harga untuk " + jumlahTiket + "Tiket Rp: " + (subtotal - (subtotal * diskon)));
        }
        System.out.println("Total tiket terjual: " + totalTiketTerjual);
        System.out.println("Total pendapatan dari penjualan tiket: Rp " + totalHarga);
    }
}
