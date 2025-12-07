public class PaymentTest {
    public static void main(String[] args) {
        // Data input
        double nominal = 50000;
        double saldoAwal = 150000;
        String provider = "OVO";

        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ===");

        // 1. Membuat objek EWalletPayment
        EWalletPayment ovo = new EWalletPayment(provider, nominal, saldoAwal);

        // 2. Menampilkan Saldo Awal (menggunakan method getBalance sebelum transaksi)
        System.out.println("Saldo awal: " + (int)ovo.getBalance());

        // 3. Menampilkan proses pembayaran
        System.out.println("Memproses pembayaran sebesar " + (int)nominal);

        // 4. Memanggil method processPayment() dan menampilkan hasilnya
        // Di sini saldo akan berkurang (50.000 nominal + 2.000 admin)
        String hasilTransaksi = ovo.processPayment();
        System.out.println(hasilTransaksi);

        // 5. Menampilkan Sisa Saldo (seharusnya 98.000)
        System.out.println("Sisa saldo: " + (int)ovo.getBalance());

        // 6. Menampilkan Detail Transaksi
        System.out.println("Detail Transaksi: " + ovo.getPaymentDetails());
    }
}