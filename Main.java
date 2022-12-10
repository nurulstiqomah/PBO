package Project;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pegawai pegawai = new Pegawai();
        pegawai.bekerja();

        Pelanggan pelanggan = new Pelanggan();
        pelanggan.memesan();

        Pelayanan pelayanan = new Pelayanan();
        pelayanan.layanan();

        Transaksi transaksi = new Transaksi() {
            @Override
            public float getTrans() {
                return 0;
            }
        };

    }
}