package class05;

class Caaa {
    private int num;

    public Caaa(int n) {
        num = n;
    }

    public int get() {
        return num;
    }
}

class Cbbb extends Caaa {
    Cbbb() {
        super(2);
    }

    public void show() {
        System.out.println("num=" + get());
    }
}

public class class05 {
    public static void main(String[] args) {
        Cbbb bb = new Cbbb();
        bb.show();
    }
}

// fail
// 的原因是:因為沒定義constructor就會預設一個沒有引數的constructor，但是Caaa的constructor已經定義為有引數的constructor，Cbbb
// call不到父類別的constructor所以會fail
// 為了不讓 Caaa 的繼承者 constructor 出現類似的 fail, 可以考慮把Caaa的 constructor 給設為沒有引數的
// constructor
// 但若是預設 num = 2 是 for Cbbb 這個 class 的專屬行為，那這個修改
// 就必須在Cbb創造一個空的 constructor，再用super設定num = 2
