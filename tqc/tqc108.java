class Ctest {
    public static String add(int a, int b) {
        return Integer.toString(a + b);
    }

    public static String add(double a, double b) {
        return String.format("%.6f", (a + b));
    }

    public static String add(String a, String b) {
        return (a + b);
    }
}

public class tqc108 {
    public static void main(String[] args) {
        System.out.println("Adding two integers:2,3");
        System.out.println("Adding two doubles:5.2,4.3");
        System.out.println("Adding two strings: I love ,java!!");
        System.out.println(Ctest.add(2, 3) + " " + Ctest.add(5.2, 4.3) + " " + Ctest.add("I love", "java!!"));
    }
}
