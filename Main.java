package Project;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        try {
            File myObj = new File("kartu ucapan.txt");
            if (myObj.createNewFile()) {
                System.out.println("File dibuat: " + myObj.getName());
        }else {
                System.out.println("File sudah ada!!");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            FileWriter myWriter = new FileWriter("kartu ucapan.txt");
            myWriter.write("Terimakasih Telah Menggunakan Jasa Kami :))");
            myWriter.close();
            System.out.println("Sukses tercetak dalam file.");
        } catch (IOException e) {
            System.out.println("terdapat error!!");
            e.printStackTrace();
        }


        Scanner input = new Scanner(System.in);
        Pegawai pegawai = new Pegawai();
        pegawai.bekerja();

        Pelanggan pelanggan = new Pelanggan();
        pelanggan.memesan();

        Pelayanan pelayanan = new Pelayanan();
        pelayanan.layanan();

        /*Pembayaran pembayaran = new Pembayaran();
        pembayaran.getTrans(); */

        /*HasilLaporan laporan = new HasilLaporan();
        laporan.jumlahTransaksi(); */

    }
}
