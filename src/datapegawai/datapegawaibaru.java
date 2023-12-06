package datapegawai;

public class datapegawaibaru {
    
    private final String nama;
    private final String shift;
    private final String jabatan;
 final int idcard;
    
        public datapegawaibaru(String nama, String shift, String jabatan, int idcard) {
        this.nama = nama;
        this.shift = shift;
        this.jabatan = jabatan;
        this.idcard = idcard;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getShift() {
        return shift;
    }
    
    public String getJabatan() {
        return jabatan;
    }
    
    public int getIdcard() {
        return idcard;
    }
    
    @Override
    public String toString() {
        return "Nama: "+ nama + ",Idcard:" + idcard + ", Jabatan: " + jabatan + ",Shift: " + shift;
}
}