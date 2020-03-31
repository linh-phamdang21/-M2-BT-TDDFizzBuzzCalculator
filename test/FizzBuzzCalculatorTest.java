import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzCalculatorTest {

    @Test
    void translate1() {
        int number = 1;
        String expected = "1";
        String result = FizzBuzzCalculator.translate(number);
        assertEquals(expected,result);
    }

    @Test
    void translate2() {
        int number = 3;
        String expected = "Fizz";
        String result = FizzBuzzCalculator.translate(number);
        assertEquals(expected,result);
    }

    @Test
    void translate3() {
        int number = 5;
        String expected = "Buzz";
        String result = FizzBuzzCalculator.translate(number);
        assertEquals(expected,result);
    }

    @Test
    void translate4() {
        int number = 43;
        String expected = "Fizz";
        String result = FizzBuzzCalculator.translate(number);
        assertEquals(expected,result);
    }

    @Test
    void translate5() {
        int number = 53;
        String expected = "Buzz";
        String result = FizzBuzzCalculator.translate(number);
        assertEquals(expected,result);
    }

    @Test
    void translate6() {
        int number = 15;
        String expected = "FizzBuzz";
        String result = FizzBuzzCalculator.translate(number);
        assertEquals(expected,result);
    }
}