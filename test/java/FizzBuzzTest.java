/*
TDD   - Test Driven Development - Developed by Kent Beck as a part of Extreme Programming.
        - Writing the Test Cases Before Developing Your Code.
        - Writing the failed test cases first and then make it to Pass.
        - TDD Cycle Red-Green-Refactor

        - Write a test for the next bit of functionality you want to add.
        - Write the functional code until the test passes.
        - Refactor both new and old code to make it well structured.
            - Refactoring is a disciplined technique for restructuring an existing body of code,
            - Altering its internal structure without changing its external behavior.
*/

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
