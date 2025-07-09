public class PayrollSystem {
    public static void main(String[] args) {

        Employee[] employees=new Employee[4];

        employees[0] = new SalariedEmployee("Oasi", "Mahmud", "111-11-1111", 25000.00);
        employees[1] = new HourlyEmployee("Shahriar Islam", "Mahi", "222-22-2222", 1200.00, 45);
        employees[2] = new ComissionEmployee("Naim", "Islam", "333-33-3333", 10000, 0.15);
        employees[3] = new BasePlusComissionEmployee("Shifat", "Mahmud", "444-44-4444", 5000, 0.05, 50000);

        for (int i=0;i<employees.length;i++) {
            System.out.println("----------------------------------");
            System.out.println(employees[i]);
            System.out.printf("Earnings: %.2f tk\n", employees[i].earnings());
        }
    }

}
