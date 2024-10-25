public class Utama {
    public static void main(String[] args) {
        // Membuat object
        Lingkaran lingkaran = new Lingkaran();
        Segitiga segitiga = new Segitiga();
        Persegi persegi = new Persegi();
        
        /* memanggil method */
        lingkaran.luas();
        lingkaran.keliling();
        
        segitiga.luas();
        segitiga.keliling();
        
        persegi.luas();
        persegi.keliling();
    }
}