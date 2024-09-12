public class soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner();

        System.out.println("Masukkan nilai 1: ");
        int nilai1 = input.nextInt();

        System.out.println("Masukkan nilai 2: ");
        int nilai2 = input.nextIn();

        int nilaiTertinggi = (nilai1 > nilai2) ? nilai1:nilai2;

        System.out.println("Nilai tertinggi adalah " + nilaiTertinggi);
    }
}