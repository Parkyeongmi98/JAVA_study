package chap_04;

public class _09_MutilpleTable {
    public static void main(String[] args) {
        // 구구단
        // 2 * 1 = 2     3 * 1 = 3     4 * 1 = 4      ...
        // 2 * 2 = 4
        // ...
        for (int i = 1; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                int result = j * i;
                System.out.print(j + " * " + i + " = " + result + "\t\t");
            }
            System.out.println();
        }
    }
}
