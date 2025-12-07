public class Manajer extends Karyawan {
    private double tunjangan;

    // Constructor
    public Manajer(String nama, double gajiPokok, double tunjangan) {
        super(nama, gajiPokok); // Panggil constructor parent (Karyawan)
        this.tunjangan = tunjangan;
    }

    // Override method untuk menyesuaikan format output Manajer
    @Override
    public void tampilInfo() {
        double total = gajiPokok + tunjangan;
        // Baris 1: Info lengkap
        System.out.println("Nama: " + nama + " | Gaji Pokok: Rp " + gajiPokok + " | Tunjangan: Rp " + tunjangan);
        // Baris 2: Total Pendapatan
        System.out.println("Total Pendapatan: Rp " + total);
    }
}