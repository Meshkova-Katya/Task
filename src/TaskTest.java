import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


class TaskTest {

    @Test
    @DisplayName("Тестируем метод calc что резльтат будет 1.")
    void calcTestEquals1() {
        int result = Task.calc(Arrays.asList(1, 2, 3, 4, 5, 6));
        Assertions.assertEquals(1, result);
    }

    @Test
    @DisplayName("Тестируем метод calc что резльтат будет 42.")
    void calcTestEquals42() {
        int result = Task.calc(Arrays.asList(6, 7));
        Assertions.assertEquals(42, result);
    }

    @Test
    @DisplayName("Тестируем метод calc что резльтат будет 84.")
    void calcTestEquals84() {
        int result = Task.calc(Arrays.asList(12, 7, 1));
        Assertions.assertEquals(84, result);
    }
}