package Project;
import java.util.Scanner;
public class Pelanggan extends Loundry{
    protected int idpelanggan;

    public int getIdpelanggan() {
        return idpelanggan;
    }

    public void setIdpelanggan(int idpelanggan) {
        this.idpelanggan = idpelanggan;
    }
    public void memesan(){
        Scanner pel = new Scanner(System.in);
        System.out.println("===========Data Pelanggan==========");
        System.out.println("masukan nomer antrian :");
        idpelanggan = pel.nextInt();
        System.out.println("masukan nama pelanggan :");
        namaPel = pel.next();
        System.out.println("masukan alamat pelanggan :");
        alamatPel = pel.next();

        System.out.println("====================================");
        System.out.println("nomor antrian :"+idpelanggan);
        System.out.println("nama pelanggan :"+namaPel);
        System.out.println("alamat pelanggan :"+alamatPel);
        System.out.println("=====================================");
    }
}
