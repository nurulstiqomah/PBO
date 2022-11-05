import employee.Pelanggan;

final class Pegawai extends Pelanggan {
    protected int idpeg;


   static void bekerja(){
       System.out.println("nama pegawai");
       System.out.println("id pegawai");
       System.out.println("alamat pegawa");
       System.out.println("no.hp");
       System.out.println("pegawai melayani pelanggan");
    }
    static public String kerja(String nama){
        return ("Bela");
    }
    static public double kerja(double alamat){
       return Double.parseDouble(("Pandeyan"));
    }


    public int getIdpeg() {
        return idpeg;
    }

    public void setIdpeg(int idpeg) {
        this.idpeg = idpeg;
    }
}
