package com.junitlearn.practice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
public class CalculatorTest {

    @Test
    public void shouldAddTwoNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.add(15,25);
        assertEquals(40, result);
    }


    @Test
    public void shouldSumTwoNumbers() {
        // Arrange
        
        int a = 10;
        int b = 20;

        // Act
        int result = a+b;

        // Assert
        // assertEquals(30, result);

        assertEquals(30, result, "Addition result should be 40");
    }

    @Test
    public void shouldThrowExceptionWhenDividingByZero() {
        // Arrange
        int a = 10;
        int b = 0;

        // Act & Assert
        assertThrows(ArithmeticException.class, () -> {
            int result = a / b;
        });

        
    }

    @Test
    public void testSubtract() {
        
        // Arrange
        int a = 20;
        int b = 10;

        // Act
        int result = a - b;

        // Assert
        assertEquals(110, result, "Addition result should be 40");
        
    }

    @Test
    public void shouldReturnTrueWhenPasswordMatches(){
        String password = "123";
        String confirmPassword = "123";

        assertTrue(password.equals(confirmPassword));


        
    }
    @Test
    void shouldCalculateTenPercentTax() {

        TaxCalculator calculator = new TaxCalculator();

        double tax = calculator.calculate(10000);

        assertEquals(1000, tax);
    }

    @Test
    void shouldCompareLists() {

        List<String> expected = List.of("Java", "Spring");

        List<String> actual = List.of("Java", "Spring");

        assertIterableEquals(expected, actual);
    }


}