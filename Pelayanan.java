import employee.Pelanggan;

public class Pelayanan extends Pelanggan {
    protected int tgl, idloundry;
    protected String layanan;

    static  void mlayani(String layanan1, String layanan2, String layanan3){
        System.out.println("layanan :  "+layanan1+",  " +layanan2+",  "+layanan3);
    }
     static void Layanan(){
        Pelayanan lay = new Pelayanan();
        lay.setTgl(11);
        System.out.println("tanggal : "+lay.getTgl());
        lay.setLayanan("Cuci-Setrika");
        System.out.println("nama layanan :"+lay.getLayanan());
        lay.setIdloundry(473);
        System.out.println("id loundry :"+lay.getIdloundry());
    }

    @Override
    public int getIdloundry() {
        return idloundry;
    }

    @Override
    public void setIdloundry(int idloundry) {
        this.idloundry = idloundry;
    }

    public int getTgl() {
        return tgl;
    }

    public void setTgl(int tgl) {
        this.tgl = tgl;
    }

    public String getLayanan() {
        return layanan;
    }

    public void setLayanan(String layanan) {
        this.layanan = layanan;
    }



}
