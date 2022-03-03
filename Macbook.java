public class Macbook extends Computer {
    String salra;
    public Macbook(String cpName, String cpBrand, String cpVersion, double cpPrice, String cpCare,String a) {
        super(cpName, cpBrand, cpVersion, cpPrice, cpCare);
        this.salra =a;
       
    }

    public static void main(String[] args) {
        Macbook m1 = new Macbook("M1", "Apple", "2022", 200000000, "2 Years","a");
        m1.getInfo();
    }
}
