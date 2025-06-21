
public class panter extends hewan {

    // atribut
    private int panjangTaring;
    private int panjangCakar;

    // method
    public void memanjat() {
        System.out.println(getNama() + " sedang manjat");
    }

    public void setPanjangTaring(int _panjang_taring) {
        if (_panjang_taring < 0) {
            this.panjangTaring = 0;
        } else {
            this.panjangTaring = _panjang_taring;
        }
    }

    public void setPanjangCakar(int _panjang_cakar) {
        if (_panjang_cakar < 0) {
            this.panjangCakar = 0;
        } else {
            this.panjangCakar = _panjang_cakar;
        }
    }

    public int getPanjangTaring() {
        if (this.panjangTaring == 0) {
            return 0;
        } else {
            return this.panjangTaring;
        }
    }

    public int getPanjangCakar() {
        if (this.panjangCakar == 0) {
            return 0;
        } else {
            return this.panjangCakar;
        }
    }

    // polymorphism
    public void makan(){
        super.makan("Daging rusa");
    }

    @Override
    public void tidur(){
        super.tidur();
    }

    public void bersuara() {
        super.bersuara("rawrr");
    }

    public void bergerak() {
        super.bergerak("lari");
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Panjang taring " + getPanjangTaring());
        System.out.println("Panjang cakar " + getPanjangCakar());
    }
}
