
class kucing extends hewan {

    //atribut
    private String rasKucing;
    private int panjangTaring;

    //method
    public void mendengkur() {
        System.out.println("meng " + super.getNama() + " dengan ras " + this.getRasKucing() + " sedang mendengkur purrrrr");
    }

    public void setRasKucing(String _rasKucing) {
        if(_rasKucing.length() < 4){
            this.rasKucing = "";
        }else
            this.rasKucing = _rasKucing;
    }

    public void setPanjangTaring(int _panjangTaring) {
        if(_panjangTaring < 0){
            this.panjangTaring = 0;
        }else 
            this.panjangTaring = _panjangTaring;
    }

    public String getRasKucing() {
        if(this.rasKucing.equals("")){
            return "Ras kucing masih kosong";
        } else 
            return this.rasKucing;
    }

    public int getPanjangTaring() {
        if(this.panjangTaring < 0){
            return 0;
        }else
            return this.panjangTaring;
    }

    //polymorphism
    @Override
    public void makan(String jenisMakanan) {
        super.makan("ikan");
    }

    @Override
    public void tidur() {
        super.tidur();
    }

    public void bersuara() {
        super.bersuara("miau");
    }


    public void bergerak() {
        super.bergerak("lari");
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Ras kucing: " + getRasKucing());
        System.out.println("Panjang taring: " + getPanjangTaring());
    }
}
