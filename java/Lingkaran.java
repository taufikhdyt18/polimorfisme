public class Lingkaran extends BangunDatar {
    private int r;
    
    public void luas() {
        double luas = 3.14 * r * r;
        System.out.println("Luas lingkaran: " + luas);
    }
    
    public void keliling() {
        double keliling = 2 * 3.14 * r;
        System.out.println("Keliling lingkaran: " + keliling);
    }
}