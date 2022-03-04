public class IT extends Personal {
    public double Salary;

    public IT(double s, String paramName) {
        super(paramName);
        this.Salary = s;
    };

    @Override
    public double payRoll() {
        return this.Salary;
    }
}