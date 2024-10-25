public class Segitiga extends BangunDatar {
    private int alas;
    private int tinggi;
    
    public void luas() {
        double luas = 0.5 * alas * tinggi;
        System.out.println("Luas segitiga: " + luas);
    }
    
    public void keliling() {
        // Asumsi segitiga siku-siku untuk perhitungan sisi miring
        double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
        double keliling = alas + tinggi + sisiMiring;
        System.out.println("Keliling segitiga: " + keliling);
    }
}
