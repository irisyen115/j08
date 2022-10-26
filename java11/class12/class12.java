package class12;

interface Data {
    public void best();

    public void failed();
}

interface Test extends Data {
    public void showData();

    public double average();
}

class CStu implements Test {
    protected String name;
    protected int math;
    protected int english;

    public CStu(String _name, int _math, int _english) {
        this.name = _name;
        this.math = _math;
        this.english = _english;
    }

    public void best(){
        if(math > english) {
            System.out.println(name + "的數學比英文好");
        } else if (math < english) {
            System.out.println(name + "的英文比數學好");
        } else {
            System.out.println(name + "的數學英文一樣好");
        }
    }

    public void failed(){
        if (math < 60) {
            System.out.println(name + "的數學當掉了");
        } else if (english < 60) {
            System.out.println(name + "的英文當掉了");
        } else if (math < 60 && english < 60) {
            System.out.println(name + "的數學英文都被當掉了");
        } else {
            System.out.println(name +"的數學英文都沒有被當");
        }
    }

    public void showData() {
        System.out.println("姓名:" + name);
        System.out.println("數學成績:" + math);
        System.out.println("英文成績:" + english);  
        System.out.println("平均成績:" + average());
    }

    public double average() {
        return (double)(math + english)/2;
    }

    public void show() {
        showData();
        best();
        failed();
    }
}

public class class12 {
    public static void main(String[] args) {
        CStu stu=new CStu ("Judy", 60,91); 
        stu.show();
    }
}
