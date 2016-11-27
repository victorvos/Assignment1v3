package Scenario4;

/**
 * Created by Victor Vos on 22/11/2016.
 */
public class Junior implements Employee {
    private String name;
    private double salary;

    public Junior(String nm, double sal) {
        name = nm;
        salary = sal;
    }

    public String toString(){
        return "Junior "+name+" earns: $"+salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String nm) {
        name = nm;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void setSalary(double sal) {
        salary = sal;
    }

    @Override
    public void RaiseSalary(double sal){
        salary = (sal * 1.07) + (20000);
    }
}