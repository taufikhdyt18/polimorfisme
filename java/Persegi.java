public class Persegi extends BangunDatar {
    private int sisi;
    
    public void luas() {
        int luas = sisi * sisi;
        System.out.println("Luas persegi: " + luas);
    }
    
    public void keliling() {
        int keliling = 4 * sisi;
        System.out.println("Keliling persegi: " + keliling);
    }
}