import employee.Pelanggan;

public class Pembayaran extends Pelanggan {
    protected boolean status;
    protected String total;
    protected int bayar;

    public Pembayaran() {}

    static String[] bayar(){
       Pembayaran pem = new Pembayaran();
       pem.setTotal(16000);
        System.out.println("Total :"+pem.getTotal());
        return bayar();
    }



    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public void sts(int total, int bayar){
        System.out.println("membayaran berhasil");
        setStatus(true);
    }

    public int getBayar() {
        return bayar;
    }

    public void setBayar(int bayar) {
        this.bayar = bayar;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = String.valueOf(total);
    }

    Pembayaran(int membayar){
        total = String.valueOf(membayar);
    }
    Pembayaran(String b1, String b2){
        total = b1 + b2;
    }

}
