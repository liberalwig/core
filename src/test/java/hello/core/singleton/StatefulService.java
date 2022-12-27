package hello.core.singleton;

public class StatefulService {

    private int price; // 싱글톤 패턴에서 공유 필드는 정말 조심해서 쓰고 늘 stateless 상태로 쓰자

    public void order(String name, int price) {
        System.out.println("price = " + price + "name = " + name);
        this.price = price;
    }

    public int getPrice() {
        return price; // 여기가 문제
    }

}
