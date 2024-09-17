public class EmployeeDriver {
    public static void main(String[] args) {
        Employee employee01 = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500.00);
        Employee employee02 = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25.00, 32.00);
        Employee employee03 = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19.00, 47.00);
        Employee employee04 = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 0.15, 50000.00);
        Employee employee05 = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700.00);
        Employee employee06 = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000.00);
        Employee employee07 = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 0.22, 40000.00);

        System.out.println(employee01 + "\n" + employee02 + "\n" + employee03 + "\n" + employee04 + "\n"
                + employee05 + "\n" + employee06 + "\n" + employee07);


    }
}
