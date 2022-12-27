import java.util.HashMap;

class Management {
    HashMap<String, Employee> m = new HashMap<String, Employee>();

    public double sumMonth() {
        double sum = 0;
        for (Employee e : m.values()) {
            sum += (e.monthPay());
        }
        return sum;
    }

    public double afterTax(String s) {
        return m.get(s).monthPay() - m.get(s).monthTaxes();
    }
}

public class tqc610_4 {
    public static void main(String[] args) {
        Employee sWorker = new SalaryWorker("96001", 180000);
        Employee hWorker = new HourlyWorker("96002", 100, 160);
        Employee manager = new Manager("97001", 240000, 5000);
        Management management = new Management();
        management.m.put("96001", sWorker);
        management.m.put("96002", hWorker);
        management.m.put("97001", manager);
        System.out.println("97001 的稅後薪資： " + management.afterTax("97001"));
    }
}
