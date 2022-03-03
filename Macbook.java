public class Macbook extends Computer {

    public Macbook(String cpName, String cpBrand, String cpVersion, double cpPrice, String cpCare) {
        super(cpName, cpBrand, cpVersion, cpPrice, cpCare);
    }

    public static void main(String[] args) {
        Macbook m1 = new Macbook("M1", "Apple", "2022", 200000000, "2 Years");
        m1.getInfo();
    }
}
