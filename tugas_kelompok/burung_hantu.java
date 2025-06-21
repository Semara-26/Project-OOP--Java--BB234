
public class burung_hantu extends hewan {
    //atribut
    private int panjangParuh;
    private int panjangSayap;

    //method
    public void Berburu() {
        System.out.println("Panjang paruh burung hantu itu, " + getPanjangParuh() + " cm, bagus untuk berburu");
        System.out.println("Semakin tua burung hantu, semakin handal dia berburu, semakin panjang juga paruhnya.");
        System.out.println("Burung hantu itu umurnya " + super.getUsia());
    }

    public void Terbang() {
        System.out.println("Burung hantu dapat terbang dengan panjang sayap " + getPanjangSayap() + " cm");
    }

    public void setPanjangParuh(int _panjangParuh) {
        if(_panjangParuh < 0){
            this.panjangParuh = 0;
        }
        this.panjangParuh = _panjangParuh;
    }

    public void setPanjangSayap(int _panjangSayap) {
        if(_panjangSayap < 0){
            this.panjangSayap = 0;
        }
        this.panjangSayap = _panjangSayap;
    }

    public int getPanjangParuh() {
        if(this.panjangParuh < 0){
            return 0;
        }
        return this.panjangParuh;
    }

    public int getPanjangSayap() {
        if(this.panjangSayap < 0){
            return 0;
        }
        return this.panjangSayap;
    }

    //polymorphism
    @Override
    public void makan(String jenisMakanan) {
        super.makan("tikus");
    }
    @Override
    public void tidur() {
        super.tidur();
    }

    public void bersuara() {
        super.bersuara("kaakk");
    }

    public void bergerak() {
        super.bergerak("terbang");
    }
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("panjang paruh: " + getPanjangParuh());
        System.out.println("panjang sayap: " + getPanjangSayap());
    }
}
