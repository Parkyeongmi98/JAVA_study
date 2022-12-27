package chap_09.coffee;

import chap_09.user.User;

public class CoffeeByUser <T extends User> { // 아무 타입이나 다 들어올 수 있지만 User 클래스 또는 User 클래스를 상속하는 VIPUser 클래스만 들어올 수 있음
    public T user;

    public CoffeeByUser(T user) {
        this.user = user;
    }

    public void ready() {
        System.out.println("커피 준비 완료: " + user.name);
        user.addPoint();
    }

}
