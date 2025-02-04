public class CommissionEmployee extends Employee{
    private double commissionRate;
    private double grossSales;

    public CommissionEmployee(String firstName, String lastName, String ssn, double commissionRate, double grossSales){
        super(firstName, lastName, ssn);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }
    public double getCommissionRate(){
        return commissionRate;
    }
    public void setCommissionRate(double commissionRate){
        this.commissionRate = commissionRate;
    }
    public double getGrossSales(){
        return grossSales;
    }
    public void setGrossSales(double grossSales){
        this.grossSales = grossSales;
    }
    @Override
    public String toString(){
        return this.getFirstName() + " " + this.getLastName() + " " +  this.getSsn() + " Commission Rate: " + commissionRate + " Gross Sale: " + grossSales;
    }
}
