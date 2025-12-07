public class UjiKaryawan {
    public static void main(String[] args) {
        System.out.println("=== DATA KARYAWAN TECHMAJU ===");

        // 1. Bagian Karyawan Biasa
        System.out.println("Status: Karyawan Biasa");
        Karyawan k = new Karyawan("Budi Santoso", 4000000);
        k.tampilInfo();

        // Jarak baris kosong
        System.out.println();

        // 2. Bagian Manajer
        System.out.println("Status: Manajer");
        Manajer m = new Manajer("Siti Aminah", 6000000, 2500000);
        m.tampilInfo();
    }
}