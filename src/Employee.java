import java.util.Scanner;

public class Employee {
    public int allowance;
    public int hoursWorked;
    public int getAllowancePerHour(int a, int h){
        return a/h;
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            Employee employee = new Employee();
            System.out.println("Enter your allowance");
            employee.allowance = scanner.nextInt();
            System.out.println("Enter hours worked");
            employee.hoursWorked = scanner.nextInt();
            System.out.println("Your allowance per hour is " + employee.getAllowancePerHour(employee.allowance, employee.hoursWorked));
        }catch(ArithmeticException e){
            System.out.println("Exception "+e.getMessage() +" has occured");
        }finally{
            System.out.println("Done");
        }

    }
}
