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

        Pembayaran pembayaran = new Pembayaran();
        pembayaran.getTrans();


    }
}
