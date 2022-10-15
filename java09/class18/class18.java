package class18;

public class class18 {
    public static void main(String args[]) {
        // 請在此撰寫 CCircle 的匿名內部類別,並用它呼叫 show() 函數來顯示出圓面積
        (new CCircle() {
            void show(double r) {
                radius = r;
                System.out.println(radius * radius * pi);
            }
        }).show(9);

    }

    public static class CCircle {
        public double pi = 3.14;
        public double radius;
    }
}
