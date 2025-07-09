 class ComissionEmployee extends Employee {
     protected double sales;
     protected double comission_rate;

   public ComissionEmployee(String first_name,String second_name,String ssn,double sales,double comission_rate){
       super(first_name,second_name,ssn);
        this.sales=sales;
        this.comission_rate=comission_rate;
   }

     @Override
     double earnings() {
         return sales*comission_rate;
     }

     @Override
     public String toString() {
         return super.toString()+"\nSales:"+sales+"\nCommission rate is:"+comission_rate;
     }
 }