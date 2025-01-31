import java.util.Scanner;

public class Employee {
    String empName;
    int empId;
    long empSal;
    String empDept;
    String empAddress;

    Scanner sc = new Scanner(System.in);
    void getEmpDetails( )
    
    {
        
        System.out.println("Enter employee name:");
        System.out.println("Employee Name:");
        empName = sc.next();

        System.out.println("Employee Id:");
        empId =sc.nextInt();

        System.out.println("Employee Salary:");
        empSal  = sc.nextInt();
  
         
        System.out.println("Employee Department:");
        empDept = sc.next();

        System.out.println("Employee Address:");
        empAddress = sc.nextLine();
        sc.nextLine();  
    }
    void Display(){
        System.out.println("Employe Name:" +empName);
        System.out.println("Employe Id:" +empId);
        System.out.println("Employe Salary:" +empSal);
        System.out.println("Employe Depatment:" +empDept);
        System.out.println("Employe Address:" +empAddress);
    }

    public static  void main(String [] args){
        Employee aobj = new Employee();
        aobj.getEmpDetails();
        System.out.println("------- You have entered below  details  -- ");

        aobj.Display();
    }
    
}
