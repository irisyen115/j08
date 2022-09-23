package class05;

class CBox {
    int length;
    int width;
    int height;

    int volume() {
        return length * width * height;
    }

    int surfaceArea() {
        return length * width * 6;
    }

    void showData() {
        System.out.println("length=" + length + "," + "width=" + width + "," + "height=" + height);
    }

    void showAll() {
        System.out.println("length=" + length + "," + "width=" + width + "," + "height=" + height + "," + "volume="
                + volume() + "," + "surfaceArea=" + surfaceArea());
    }
}

public class class05 {
    public static void main(String[] args) {
        CBox box;
        box = new CBox();

        box.height = 1;
        box.length = 1;
        box.width = 1;

        System.out.println("volume=" + box.volume());
        System.out.println("surfaceArea=" + box.surfaceArea());
        box.showData();
        box.showAll();
    }
}