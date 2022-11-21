package class14;

public class class14 {
    public static void main(String[] args) {
        String s = "Habit is second nature.";
        // 如果nature不在s裡面，indexOf就會回傳-1，而-1無法substring任何東西
        int a = s.indexOf("nature");
        if (a == -1) {
            System.out.println("not in s");
        } else {
            System.out.println("s.substring(s.indexOf(\"nature\"))=" + s.substring(a));
        }
    }
}
