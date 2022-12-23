package chap_03;

public class _03_String3 {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2)); // 문자열 내용이 같으면 true, 다르면 false
        System.out.println(s1.equals("Java"));
        System.out.println(s2.equals("python")); // 대소문자 구분
        System.out.println(s2.equalsIgnoreCase("python")); // 대소문자 구분 x

        // 문자열 비교 심화
        s1 = "1234"; // 벽에 붙은 메모지의 비밀번호 정보
        s2 = "1234";
        System.out.println(s1.equals(s2)); // true (내용 비교)
        System.out.println(s1 == s2); // true (참조 비교)

        s1 = new String("1234");
        s2 = new String("1234"); // 서로 다른 메모리에 저장
        System.out.println(s1.equals(s2)); // true (내용 비교)
        System.out.println(s1 == s2); // false (참조 비교)
    }
}