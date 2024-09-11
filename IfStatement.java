import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nomorhari;
        System.out.println("Masukkan no.1-7: ");
        nomorhari = scanner.nextInt();
        String namaHari = "";

        if (nomorhari == 1){
            namaHari = "Minggu";
        } else if (nomorhari== 2) {
            namaHari = "Senin";
        } else if (nomorhari == 3) {
            namaHari = "Selasa";
        } else if (nomorhari == 4) {
            namaHari = "Rabu";
        } else if (nomorhari == 5) {
            namaHari = "Kamis";
        } else if (nomorhari == 6) {
            namaHari = "Jumat";
        } else if (nomorhari == 7) {
            namaHari = "Sabtu";
        } else {
            System.out.println("Masukkan Nomor hanya antara 1-7!!");
            System. exit(0);
        }
        System.out.println("Nama hari: " + namaHari);
    }
}
