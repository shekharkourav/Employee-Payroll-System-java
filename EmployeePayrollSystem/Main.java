package EmployeePayrollSystem;
abstract class Employee{
  private String name;
  private int id;
  public Employee(String name,int id){
     this.name=name;
     this.id=id;
  }
  // implimantation of encapsulation
  public String getName(){
    return name;
  }
  public int getId(){
    return id;
  }

  public abstract double calculateSalary();

  @Override
  public String toString(){
    return "Employee [name="+name+", id="+id+", salary="+calculateSalary()+"]";
  }
}

class FullTimeEmployee extends Employee{
    private double monthlySalary;
    public FullTimeEmployee(String name,int id,double monthlySalary){
    super(name, id);
    this.monthlySalary=monthlySalary;
    }

    @Override
    public double calculateSalary(){
       return monthlySalary;
    }
}

class PartTimeEmployee extends Employee{
    private int hoursWorked;
    private double hourlyRate;
    public PartTimeEmployee(String name,int id,int hoursWorked,double hourlyRate){
        super(name, id);
        this.hourlyRate=hourlyRate;
        this.hoursWorked=hoursWorked; 
    }

    @Override
    public double calculateSalary(){
       return hoursWorked*hourlyRate;
    }
}
public class Main {
public static void main(String[] args) {
    System.out.println("jai shree ram");
}   
}
