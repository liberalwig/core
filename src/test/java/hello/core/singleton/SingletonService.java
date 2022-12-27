package hello.core.singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.security.PublicKey;

public class SingletonService {

    private static final SingletonService instance = new SingletonService(); // static 영역에 이거 하나만 올라감

    public static SingletonService getInstance() {
        return instance;
    }

    // 3. 생성자를 private 로 선언해서 외부에서 new 키워드를 사용한 객체 생성을 막는다
    private SingletonService() {

    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");

    }
}
