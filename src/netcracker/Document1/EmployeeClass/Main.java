package netcracker.Document1.EmployeeClass;

public class Main {
    public static void main(String[] args) {
        Employee employee= new Employee(5,"Ice","Frog",1000);

        System.out.println(employee.toString()+"Annual Salary "+employee.getAnnualSalary()+" Raised Salary " + employee.raiseSalary(25));
        employee.setSalary(666);
        System.out.println(employee.toString()+"Annual Salary "+employee.getAnnualSalary()+" Raised Salary " + employee.raiseSalary(27));
    }
}
