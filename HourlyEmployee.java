 class HourlyEmployee extends Employee {
    private double wage;
    private double hours;

  public HourlyEmployee(String firt_name,String second_name,String ssn,double wage,double hours){
      super(firt_name,second_name,ssn);
      this.wage=wage;
      this.hours=hours;
  }

     @Override
     double earnings() {
        if(hours<=40){
            return wage*hours;
        }else{
            return (wage*40) + ((hours-40)*wage);
        }
     }

     @Override
     public String toString() {
         return super.toString()+"\nWage is:"+wage+"\nTotal working hours:"+hours;
     }
 }
