public class IT extends Personal{
    public double Salary;
    public IT(String name,double s){
        super(name);
        this.Salary=s;
       
    };

    @Override
    public double payRoll(){
        return this.Salary;
    }
}