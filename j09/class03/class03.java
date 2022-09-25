class Caaa {
    // private int value;
    private int value;

    // (a)
    public Caaa() {
        value = 10;
        System.out.println("value=" + value);
    }

    public Caaa(int i) {
        value = i;
        System.out.println("value=" + value);
    }
}

public class class03 {
    public static void main(String[] args) {

        // (b) 6-10行
        Caaa obj1 = new Caaa();
        // 12-16行
        Caaa obj2 = new Caaa(12);
    }
}

// d - fixup

// Add.(c)不行，因為一個文件只能有一個跟文件名一樣的class
// (d)不會，因為沒有抽取value