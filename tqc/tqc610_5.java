public class tqc610_5 {
    public static void main(String[] args) {
        Employee sWorker = new SalaryWorker("96001", 180000);
        Employee hWorker = new HourlyWorker("96002", 100, 160);
        Employee manager = new Manager("97001", 240000, 5000);
        Management management = new Management();
        management.m.put("96001", sWorker);
        management.m.put("96002", hWorker);
        management.m.put("97001", manager);
        System.out.println(management.sumMonth());
        try

        {
            if (management.sumMonth() > 50000) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Total salary exceed limit:" + management.sumMonth());
        }
    }
}
