package chap_09;

import javax.swing.*;

public class _01_Generics {
    public static void main(String[] args) {
        // 제네릭스
        // 다양한 타입의 객체를 지원하는 클래스나 인터페이스, 메소드를 정의하는 방법
        // 똑같은 동작을 하는 클래스나 메소드를 한번만 정의하고 여러 타입에 대해서 지원

        // 기본 자료형(int, double, float, boolean, ...)은 제네릭스타입으로 바로 쓸 수 없음
        // int -> Integer   double -> Double   float -> Float (래퍼 클래스)
        Integer[] iArray = {1, 2, 3, 4, 5};
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sArray = {"A", "B", "C", "D", "E"};

        printIntArray(iArray);
        printDoubleArray(dArray);
        printStringArray(sArray);

        System.out.println("----------------");

        printAnyArray(iArray);
        printAnyArray(dArray);
        printAnyArray(sArray);
    }

    // T : Type -> 어떤 타입이 들어올지 모름
    private static <T> void printAnyArray(T[] array) {
        for (T t : array) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    private static void printStringArray(String[] sArray) {
        for (String s : sArray) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    private static void printDoubleArray(Double[] dArray) {
        for (double d : dArray) {
            System.out.print(d + " ");
        }
        System.out.println();
    }

    private static void printIntArray(Integer[] iArray) {
        for (int i : iArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
