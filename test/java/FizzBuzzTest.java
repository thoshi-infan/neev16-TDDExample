import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void ShouldReturnFizzIfTheNumberIsDivisibleByThree() {
        //Arrange
        FizzBuzz fizzBuzz = new FizzBuzz(3);
        //Act
        String result = fizzBuzz.returnString();
        //Assert
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

    @Test
    void ShouldReturnStringValueIfTheNumberIsNotDivisibleByBothThreeAndFive() {
        FizzBuzz fizzBuzz = new FizzBuzz(7);
        String result = fizzBuzz.returnString();
        assertEquals("7",result);
    }

}
