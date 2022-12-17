package Project;
import java.util.Scanner;
public class HasilLaporan implements Laporan{
    int pendapat;

    public HasilLaporan(){
        this.pendapat = pendapat;

    }

    @Override
    public final int jumlahTransaksi() {
        Scanner trank = new Scanner(System.in);
        System.out.println("Masukan Jumlah transaksi :");
        int transaksi = trank.nextInt();
        System.out.println("Masukan Jumlah pendapatan :");
        pendapat = trank.nextInt();
        int pendapatan = transaksi * pendapat;
        System.out.println("Jumlah transaksi adalah : "+transaksi);
        System.out.println("Jumlah pendapatan adalah :"+pendapatan);
        return jumlahTransaksi();
    }

}
