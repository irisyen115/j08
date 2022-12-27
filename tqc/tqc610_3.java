public class tqc610_3 {
    public static void main(String[] args) {
        SalaryWorker sWorker = new SalaryWorker("96001", 180000);
        HourlyWorker hWorker = new HourlyWorker("96002", 100, 160);
        Manager manager = new Manager("97001", 240000, 5000);
        System.out.println("SalaryWorker稅額：" + sWorker.monthTaxes());
        System.out.println("HourlyWorker稅額：" + hWorker.monthTaxes());
        System.out.println("Manager稅額：" + manager.monthTaxes());
        System.out.println("平均稅額：" + Employee.getAverageTax());
    }
}
