public class EWalletPayment implements PaymentMethod {
    // Atribut sesuai ketentuan Soal C
    private String namaLayanan;
    private double nominalPembayaran;
    private double saldoPengguna;

    // Constructor untuk mengisi nilai atribut
    public EWalletPayment(String namaLayanan, double nominalPembayaran, double saldoPengguna) {
        this.namaLayanan = namaLayanan;
        this.nominalPembayaran = nominalPembayaran;
        this.saldoPengguna = saldoPengguna;
    }

    // Mengembalikan biaya transaksi (Admin Fee)
    @Override
    public double getTransactionFee() {
        return 2000.0; // Biaya admin Rp 2.000 sesuai hitungan (150rb - 50rb - 98rb = 2rb)
    }

    // Memproses pembayaran dengan memperhitungkan nominal + fee
    @Override
    public String processPayment() {
        double totalTagihan = nominalPembayaran + getTransactionFee();

        if (saldoPengguna >= totalTagihan) {
            saldoPengguna -= totalTagihan; // Kurangi saldo dengan total (nominal + admin)
            return "Pembayaran berhasil!";
        } else {
            return "Pembayaran gagal! Saldo tidak cukup.";
        }
    }

    // Mengembalikan informasi transaksi
    @Override
    public String getPaymentDetails() {
        return "Pembayaran dilakukan melalui " + namaLayanan;
    }

    // Mengembalikan saldo saat ini
    @Override
    public double getBalance() {
        return saldoPengguna;
    }
}