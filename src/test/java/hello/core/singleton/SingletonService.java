package hello.core.singleton;

public class SingletonService {

    // 자기 자신을 static 변수로 선언 (한번만 생성됨)
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() {
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
