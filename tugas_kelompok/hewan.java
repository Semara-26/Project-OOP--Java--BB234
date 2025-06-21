
public class hewan {

    private String nama;
    private String jenis;
    private int usia;
    private String warnaDominan;
    private String habitat;

    public void makan(String jenisMakanan) {
        System.out.println("Makan dengan lauk " + jenisMakanan);
    }

    public void tidur() {
        System.out.println("zzzzzzzz");
    }

    public void bersuara(String suara) {
        System.out.println(suara);

    }

    public void bergerak(String aktivitas) {
        System.out.println(aktivitas);
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + getNama());
        System.out.println("Jenis: " + getJenis());
        System.out.println("Usia: " + getUsia());
        System.out.println("Warna Dominan: " + getWarnaDominan());
        System.out.println("Habitat: " + getHabitat());
    }

    public void setNama(String _nama) {
        if(_nama.length() < 2){
            this.nama = "";
        }
        this.nama = _nama;
    }

    public void setJenis(String _jenis) {
        if(_jenis.length() < 4){
            this.nama = "";
        }
        this.jenis = _jenis;
    }

    public void setUsia(int _usia) {
        if(_usia < 0){
            this.usia = 0;
        }
        this.usia = _usia;
    }

    public void setWarnaDominan(String _warnaDominan) {
        if(_warnaDominan.length() < 5){
            this.warnaDominan = "";
        }
        this.warnaDominan = _warnaDominan;
    }

    public void setHabitat(String _habitat) {
        if(_habitat.length() < 4){
            this.habitat = "";
        }
        this.habitat = _habitat;
    }

    public String getNama() {
        if(this.nama.equals("")){
            return "Nama masih kosong";
        }
        return this.nama;
    }

    public String getJenis() {
        return this.jenis;
    }

    public int getUsia() {
        return this.usia;
    }

    public String getWarnaDominan() {
        return this.warnaDominan;
    }

    public String getHabitat() {
        return this.habitat;
    }
}
