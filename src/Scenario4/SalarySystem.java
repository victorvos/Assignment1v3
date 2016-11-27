package Scenario4;

import java.util.ArrayList;

/**
 * Created by Victor Vos on 22/11/2016.
 */
public class SalarySystem {
    private ArrayList empArray = new ArrayList();
    public void addColleague(Employee c) {
        empArray.add(c);
    }
    public Employee search(String s) {
        for (int i = 0; i < empArray.size(); i++)
            if (((Employee)empArray.get(i)).getName().equals(s)) return (Employee)empArray.get(i);
        return new Senior("no employee has been found",-1);
    }

    public SalarySystem() {
        Employee j = new Junior("Jaap",0);
        Employee m = new Medior("Fred",1);
        Employee s = new Senior("Hans",2);
        j.setSalary(1700.0);
        m.setSalary(2000);
        s.setSalary(2300);
        addColleague(j);
        addColleague(m);
        addColleague(s);
    }

    public void printAll() {
        for (Object e : empArray) {
            Employee e1 = (Employee)e;
            System.out.print(e.toString() + "\n");
        }
    }
}
