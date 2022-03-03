public class Computer {
    public String computerName;
    public String computerBrand;
    public String computerVersion;
    public double computerPrice;
    public String computerCare;

    public Computer(String cpName, String cpBrand, String cpVersion, double
    cpPrice, String cpCare) {
    this.computerName = cpName;
    this.computerBrand = cpBrand;
    this.computerVersion = cpVersion;
    this.computerPrice = cpPrice;
    this.computerCare = cpCare;
    }

    public void setComputerName(String cpName) {
        this.computerName = cpName;
    }

    public String getComputerName() {
        return this.computerName;
    }

    public void getInfo() {
        System.out.println("This is computer" + this.getComputerName());
    }
}
