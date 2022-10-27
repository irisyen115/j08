package class11;

interface Data {
    public void showData();
}

interface Test {
    public void showScore();

    public double calcu();
}

class CStu implements Data, Test {
    protected String id;
    protected String name;
    protected int mid;
    protected int finl;
    protected int common;

    public CStu(String _id, String _name, int _mid, int _finl, int _commom) {
        this.id = _id;
        this.name = _name;
        this.mid = _mid;
        this.finl = _finl;
        this.common = _commom;
    }

    public void showData() {
        System.out.println("學號:" + id);
        System.out.println("姓名:" + name);
    }

    public void showScore() {
        System.out.println("期中:" + mid);
        System.out.println("期末:" + finl);
        System.out.println("平時:" + common);
        System.out.println("學期:" + calcu());
    }

    public void show() {
        showData();
        showScore();
    }

    public double calcu() {
        return (mid * .3 + finl * .3 + common * .4);
    }
}

public class class11 {
    public static void main(String[] args) {
        CStu stu = new CStu("940001", "Fiona", 90, 92, 85);
        stu.show();
    }
}
