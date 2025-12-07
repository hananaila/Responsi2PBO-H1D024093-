import java.util.Arrays;
import java.util.Comparator;

public class analisisMesin {
    public static void main(String[] args) {
        // 1. Buat Array berisi 5 mesin
        defaultMesin[] inventaris = new defaultMesin[5];

        inventaris[0] = new mesinMotor("Honda Supra X", 125, "Bebek");
        inventaris[1] = new mesinTraktor("Kubota MX5200", 520, 5.0);
        inventaris[2] = new mesinTraktorListrik("EcoTrac Z900", 300, 4.2, 70);
        inventaris[3] = new mesinMotor("Yamaha R25", 250, "Sport");
        inventaris[4] = new mesinTraktorListrik("Volta FarmX", 200, 3.5, 80);

        // 2. Loop Tampilkan Info
        System.out.println("=== DATA MESIN MEGATECH ===");
        for (defaultMesin m : inventaris) {
            m.tampilInfo();
            System.out.println("Kategori: " + m.kategoriMesin());
            System.out.println("Performa: " + m.nilaiPerforma());
            System.out.println();
        }

        // 3. Loop Suara Mesin
        System.out.println("=== SUARA MESIN ===");
        for (defaultMesin m : inventaris) {
            if (m instanceof mesinTraktorListrik) {
                ((mesinTraktorListrik) m).suaraMesin();
            } else if (m instanceof mesinTraktor) {
                ((mesinTraktor) m).suaraMesin();
            } else if (m instanceof mesinMotor) {
                ((mesinMotor) m).suaraMesin();
            }
        }

        // 4. Cari Mesin Performa Tertinggi
        defaultMesin maxMesin = inventaris[0];
        for (defaultMesin m : inventaris) {
            if (m.nilaiPerforma() > maxMesin.nilaiPerforma()) {
                maxMesin = m;
            }
        }
        System.out.println("\n=== MESIN PERFORMA TERTINGGI ===");
        System.out.println(maxMesin.namaMesin + " \u2192 " + maxMesin.nilaiPerforma());

        // 5. Top 3 Mesin Terbaik
        System.out.println("\n=== TOP 3 MESIN TERBAIK ===");

        // Sorting Descending
        Arrays.sort(inventaris, new Comparator<defaultMesin>() {
            @Override
            public int compare(defaultMesin m1, defaultMesin m2) {
                return Double.compare(m2.nilaiPerforma(), m1.nilaiPerforma());
            }
        });

        // Tampilkan 3 Teratas
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + inventaris[i].namaMesin + " \u2192 " + inventaris[i].nilaiPerforma());
        }
    }
}