class Employee {
    String id;
    static int num = 0;
    static double sum = 0;

    public double monthPay() {
        return 0.0;
    }

    public double monthTaxes() {
        return 0.0;
    }

    public static double getAverageTax() {
        return sum / num;
    }
}

class SalaryWorker extends Employee {
    String id;
    double salary;

    SalaryWorker(String _id, double _salary) {
        id = _id;
        salary = _salary;
        Employee.num += 1;
        Employee.sum += monthTaxes();
    }

    public double monthPay() {
        return salary / 12;
    }

    public double monthTaxes() {
        return monthPay() * 0.15;
    }
}

class HourlyWorker extends Employee {
    String id;
    double time;
    double hourly;

    HourlyWorker(String _id, double _time, double _hourly) {
        id = _id;
        time = _time;
        hourly = _hourly;
        Employee.num += 1;
        Employee.sum += monthTaxes();
    }

    public double monthPay() {
        return hourly * time;
    }

    public double monthTaxes() {
        return monthPay() * 0.15;
    }
}

class Manager extends Employee {
    String id;
    double salary;
    double bonus;

    Manager(String _id, double _salary, double _bonus) {
        id = _id;
        salary = _salary;
        bonus = _bonus;
        Employee.num += 1;
        Employee.sum += monthTaxes();
    }

    public double monthPay() {
        return bonus + salary / 12;
    }

    public double monthTaxes() {
        return monthPay() * 0.15;
    }
}

public class tqc610_1 {
    public static void main(String[] args) {
        SalaryWorker sWorker = new SalaryWorker("96001", 180000);
        HourlyWorker hWorker = new HourlyWorker("96002", 100, 160);
        Manager manager = new Manager("97001", 240000, 5000);
        System.out.println("SalaryWorker : " + sWorker.monthPay());
        System.out.println("HourlyWorker : " + hWorker.monthPay());
        System.out.println("Manager : " + manager.monthPay());
    }
}
