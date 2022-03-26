import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void ShouldReturnFizzIfTheNumberIsDivisibleByThree() {
        FizzBuzz fizzBuzz = new FizzBuzz(3);
        String result = fizzBuzz.returnString();
        assertEquals("Fizz",result);
    }
}
