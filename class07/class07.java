package class07;

class CTest {
  void test(int a) {
    if (a == 0) {
      System.out.println("此數為0");
    } else {
      if (a % 2 == 0) {
        System.out.println("此數為偶數");
      } else if (a % 2 == 1) {
        System.out.println("此數為奇數");
      }
    }
  }
}

public class class07 {
  public static void main(String[] args) {
    CTest test1 = new CTest();

    test1.test(3);
    test1.test(8);
    test1.test(0);
  }
}