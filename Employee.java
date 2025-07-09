 abstract class Employee {
    protected String firt_name;
    protected String second_name;
    protected String ssn;

public Employee(String firt_name,String second_name,String ssn){
     this.firt_name=firt_name;
     this.second_name=second_name;
     this.ssn=ssn;

}

     abstract  double earnings();
@Override
     public String toString(){
    return "Employee Name:"+firt_name+" "+second_name+"\nSocial Security Number:"+ssn;
}
}
