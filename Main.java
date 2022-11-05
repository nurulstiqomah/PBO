import employee.Pelanggan;

public class Main {
    public static void main(String[] args) {

        Pelanggan pel = new Pelanggan();
        pel.setNama("Bambang");
        System.out.println("nama :"+pel.getNama());
        pel.setAlamat("jln pandeyan");
        System.out.println("alamat :"+pel.getAlamat());

      Pelayanan.Layanan();
      Pelayanan.mlayani("setrika","cuci","cuci+setrika");
      Pembayaran.bayar();
      Pegawai.bekerja();
      String[] byar;
        boolean sts = false;
      do {
          byar =Pembayaran.bayar();
          Pembayaran pembayaran = new Pembayaran(byar[0], byar[1]);
          pembayaran.isStatus();
      }while (!sts);

        }
    }
