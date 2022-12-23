package chap_07;

public class _01_Class {
    public static void main(String[] args) {
        // 객체 지향 프로그래밍 (OOP : Object-Oriented Programming)
        // 유지보수 용이
        // 높은 재사용성

        // 차량용 블랙박스
        // 모델용, 해상도, 가격, 색상

        // 우리가 만든 첫 번째 제품
        String modelName1 = "까망이";
        String resolution1 = "FHD";
        int price1 = 200000;
        String color1 = "블랙";

        // 새로운 제품을 개발
        String modelName2 = "하양이";
        String resolution2 = "UHD";
        int price2 = 300000;
        String color2 = "화이트";

        // 또다른 제품을 개발?
        BlackBox bbox = new BlackBox();
        // BlackBox 클래스(설계도)로부터 bbox 객체 생성
        // bbox 객체는 BlackBox 클래스의 인스턴스(객체)

        BlackBox bbox2 = new BlackBox();
    }
}
