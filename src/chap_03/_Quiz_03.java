package chap_03;

import java.util.Scanner;

public class _Quiz_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("주민번호를 입력하세요.");
        String input = sc.nextLine();

        System.out.println(input.substring(0, 8));
    }
}
