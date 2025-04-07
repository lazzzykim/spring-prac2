package hello.core.scope;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Scope;

public class SingletonWithPrototypeTest1 {

    @Test
    void prototypeFind() {

    }

    @Scope("prototype")
    static class PrototypeBean {
        private int count = 0;
    }
}
