class menuutama{
    public static void main(String[] args) {
        inisialisasi.init();
        System.out.println("Data Kucing: ");
        for (kucing itemKucing : inisialisasi.listKucing) {
            System.out.println("---------------------------");
            itemKucing.tampilkanInfo();
        } 
        System.out.println("Data Panter: ");
        for (panter itemPanter : inisialisasi.listPanter) {
            System.out.println("---------------------------");
            itemPanter.tampilkanInfo();
        } 
        System.out.println("Data Burung Hantu: ");
        for (burung_hantu itemBurungHantu : inisialisasi.listBurungHantu) {
            System.out.println("---------------------------");
            itemBurungHantu.tampilkanInfo();
        }  
        System.out.println("---------------------------");
        System.out.println("Pilihan Menu");
    }
}