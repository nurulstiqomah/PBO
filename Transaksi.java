package Project;

public abstract class Transaksi extends Loundry {
    protected int idTransaksi, beratBaju, total;
    protected String tanggal;

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public int getBeratBaju() {
        return beratBaju;
    }

    public void setBeratBaju(int beratBaju) {
        this.beratBaju = beratBaju;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public abstract float getTrans();
}
