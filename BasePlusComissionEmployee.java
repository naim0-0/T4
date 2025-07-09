 class BasePlusComissionEmployee extends ComissionEmployee {
    private double base_salary;

     BasePlusComissionEmployee(String first_name,String second_name,String ssn,double sales,double comission_rate,double base_salary) {
         super(first_name, second_name, ssn, sales, comission_rate);
         this.base_salary = base_salary;
     }
  void increase_salary(){
         base_salary=base_salary+base_salary*0.10;
  }

     @Override
     double earnings() {
         return super.earnings()+base_salary;
     }

     @Override
     public String toString() {
         return super.toString()+"\nBase salary is:"+ base_salary;
     }
 }
