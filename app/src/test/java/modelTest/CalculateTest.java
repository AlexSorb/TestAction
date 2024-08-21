package modelTest;

import org.example.model.Calculate;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

public class CalculateTest {

    @Test
    public void sumTest() {
        int result = 20 + 3;
        Assertions.assertThat(Calculate.sum(20, 3)).isEqualTo(result);
    }
}
