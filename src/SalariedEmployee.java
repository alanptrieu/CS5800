public class SalariedEmployee extends Employee{
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String ssn, double weeklySalary){
        super(firstName, lastName, ssn);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary(){
        return weeklySalary;
    }
    public void setWeeklySalary(double weeklySalary){
        this.weeklySalary = weeklySalary;
    }
    @Override
    public String toString(){
        return this.getFirstName() + " " + this.getLastName() + " " +  this.getSsn() + " Weekly Salary: " + weeklySalary;
    }
}
