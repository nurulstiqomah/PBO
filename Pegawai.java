package Project;
import java.util.Scanner;
public class Pegawai extends Loundry{
  public int idpegawai;

    public int getIdpegawai() {
        return idpegawai;
    }

    public void setIdpegawai(int idpegawai) {
        this.idpegawai = idpegawai;
    }

   public void bekerja(){
       Scanner inp = new Scanner(System.in);
       System.out.println("========LOUNDRY KILAT=========");
       System.out.println("==============================");
       System.out.println("masukan id pegawai : ");
       idpegawai = inp.nextInt();
       System.out.println("masukan nama pegawai :");
       namaPeg = inp.next();
       System.out.println("masukan alamat pegawai :");
       alamatPeg = inp.next();

       System.out.println("================================");
       System.out.println("id pegawai :"+idpegawai);
       System.out.println("nama pegawai :"+namaPeg);
       System.out.println("alamat pegawai :"+alamatPeg);
       System.out.println("================================");

   }
}
