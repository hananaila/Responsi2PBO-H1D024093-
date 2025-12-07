public class Karyawan {
    // Variabel state (protected agar bisa diakses subclass Manajer)
    protected String nama;
    protected double gajiPokok;

    // Constructor
    public Karyawan(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    // Method tampilInfo dasar
    public void tampilInfo() {
        System.out.println("Nama: " + nama + " | Gaji Pokok: Rp " + gajiPokok);
    }
}