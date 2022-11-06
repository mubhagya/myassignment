package armnum;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class junit3Test {
    junit3 m1;
    @BeforeEach
    void init() {
        m1 = new junit3();
    }

    @Test()
    void test() {
        int actual = m1.withdraw(1000);
    }
}


