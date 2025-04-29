package java29;
public class java29 {
 String name;
 int id;
 double salary;
 String address;

 public java29(String name, int id, double salary, String address )
 {
    this.name = name;
    this.id = id;
    this.salary = salary;
    this.address = address;
 }
 
 public void display()
 {
    System.out.println("Employee Name:"+name);
    System.out.println("Employee ID:"+id);
    System.out.println("Employee Salary:"+salary);
    System.out.println("Employee address:"+address);
 }

 public static void main(String[] args) {
   java29 emp=new java29("Yashvant", 264,50000,"vidhya nagar");
    emp.display();
 }
 

}
