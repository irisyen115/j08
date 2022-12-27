public class tqc610_2 {
    public static void main(String[] args) {
        SalaryWorker sWorker = new SalaryWorker("96001", 180000);
        HourlyWorker hWorker = new HourlyWorker("96002", 100, 160);
        Manager manager = new Manager("97001", 240000, 5000);
        System.out.println("SalaryWorker : " + sWorker.monthPay());
        System.out.println("HourlyWorker : " + hWorker.monthPay());
        System.out.println("Manager : " + manager.monthPay());

        compare(sWorker, hWorker, manager);

        System.out.println("SalaryWorker稅額：" + sWorker.monthTaxes());
        System.out.println("HourlyWorker稅額：" + hWorker.monthTaxes());
        System.out.println("Manager稅額：" + manager.monthTaxes());

    }

    public static void compare(SalaryWorker s, HourlyWorker h, Manager m) {
        if (s.monthPay() > h.monthPay()) {
            System.out.println(s.id + "較高");
        } else {
            System.out.println(h.id + "較高");
        }
        if (h.monthPay() > m.monthPay()) {
            System.out.println(h.id + "較高");
        } else {
            System.out.println(m.id + "較高");
        }
    }
}
