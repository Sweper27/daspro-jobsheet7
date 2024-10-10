import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenisKendaraan,durasiparkir;
        double totalPembayaran = 0, pembeyaran ;

        do {
            System.out.print("Masukkan jenis kendaraan (1 untuk mobil, 2 untuk motor, 0 untuk keluar): ");
            jenisKendaraan = sc.nextInt();

            
            if (jenisKendaraan == 0) {
                break;
            }

            System.out.print("Masukkan durasi parkir (dalam jam): ");
            durasiparkir = sc.nextInt();

            
            if (durasiparkir < 0) {
                System.out.println("Durasi parkir tidak boleh negatif. Silakan coba lagi.");
                continue; 
            }

            double pembayaran;

            
            if (durasiparkir > 5) {
                pembayaran = 12500; 
            } else {
                if (jenisKendaraan == 1) { 
                    pembayaran = durasiparkir * 3000;
                } else if (jenisKendaraan == 2) { 
                    pembayaran = durasiparkir * 2000;
                } else {
                    System.out.println("Jenis kendaraan tidak valid. Silakan coba lagi.");
                    continue; 
                }
            }

            totalPembayaran += pembayaran; 
            System.out.println("Total pembayaran untuk parkir: Rp " + pembayaran);
        } while (true);

        
        System.out.println("Total pembayaran parkir: Rp " + totalPembayaran);
    }
}
