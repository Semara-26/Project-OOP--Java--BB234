import java.util.ArrayList;

class inisialisasi{
    public static ArrayList<kucing> listKucing = new ArrayList<>();
    public static ArrayList<panter> listPanter = new ArrayList<>();
    public static ArrayList<burung_hantu> listBurungHantu = new ArrayList<>();
    public static void init(){
        kucing meng1 = new kucing();
        meng1.setNama("Maru");
        meng1.setUsia(2);
        meng1.setJenis("Kucing");
        meng1.setPanjangTaring(3);
        meng1.setWarnaDominan("Putih");
        meng1.setRasKucing("Kucing Kampung");
        meng1.setHabitat("Rumah");
        listKucing.add(meng1);
        // ====================================================
        panter p1 = new panter();
        p1.setNama("Tchalla");
        p1.setJenis("Black Panter");
        p1.setUsia(5);
        p1.setWarnaDominan("Hitam");
        p1.setHabitat("Hutan");
        p1.setPanjangTaring(5);
        p1.setPanjangCakar(5);
        listPanter.add(p1);
        // ======================================================
        burung_hantu bH1 = new burung_hantu();
        bH1.setNama("Hawk");
        bH1.setJenis("Ninox");
        bH1.setUsia(3);
        bH1.setWarnaDominan("Coklat");
        bH1.setHabitat("Hutan Terbuka");
        bH1.setPanjangParuh(3);
        bH1.setPanjangSayap(10);
        listBurungHantu.add(bH1);
    }


}