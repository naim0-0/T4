class SalariedEmployee extends Employee{

    private double weekly_salary;

   public SalariedEmployee(String first_name,String second_name,String ssn,double weekly_salary) {
       super(first_name, second_name, ssn);
       this.weekly_salary = weekly_salary;
   }

    @Override
    double earnings() {
        return weekly_salary;
    }

    @Override
    public String toString() {
        return super.toString()+"\nWeekly salary is:"+weekly_salary;
    }
}
