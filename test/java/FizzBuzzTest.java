import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void ShouldReturnFizzIfTheNumberIsDivisibleByThree() {
        FizzBuzz fizzBuzz = new FizzBuzz(3);
        String result = fizzBuzz.returnString();
        assertEquals("Fizz",result);
    }

    @Test
    void ShouldReturnBuzzIfTheNumberIsDivisibleByFive() {
        FizzBuzz fizzBuzz = new FizzBuzz(5);
        String result = fizzBuzz.returnString();
        assertEquals("Buzz",result);
    }

    @Test
    void ShouldReturnFizzBuzzIfTheNumberIsDivisibleByBothThreeAndFive() {
        FizzBuzz fizzBuzz = new FizzBuzz(15);
        String result = fizzBuzz.returnString();
        assertEquals("FizzBuzz",result);
    }

}
