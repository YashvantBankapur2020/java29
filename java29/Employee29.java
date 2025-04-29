package java29;
public class Employee29 {
 String name;
 int id;
 double salary;

 public Employee29(String name, int id, double salary) 
 {
    this.name = name;
    this.id = id;
    this.salary = salary;
 }
 
 public void display()
 {
    System.out.println("Employee Name:"+name);
    System.out.println("Employee ID:"+id);
    System.out.println("Employee Salary:"+salary);

 }

 public static void main(String[] args) {
    Employee29 emp=new Employee29("Yashvant", 264,50000);
    emp.display();
 }
 

}
