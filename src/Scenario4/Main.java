package Scenario4;

/**
 * Created by Victor Vos on 22/11/2016.
 */
public class Main {
    public static void main(String args[]) {
        // raise salary of all employees
        SalarySystem s = new SalarySystem();
        s.printAll();
        Employee e = s.search("Jaap");
        e.RaiseSalary(e.getSalary());
        e = s.search("Fred");
        e.RaiseSalary(e.getSalary());
        e = s.search("Hans");
        e.RaiseSalary(e.getSalary());
        s.printAll();
    }
}
