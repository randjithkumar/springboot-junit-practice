package com.junitlearn.practice;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootJunitPracticeApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void shouldThrowExceptionWhenBalanceIsInsufficient() {
		// Arrange
		AccountService accountService = new AccountService();
		double balance = 100.0;
		double amount = 150.0;

		// Act & Assert
		assertThrows(IllegalArgumentException.class, () -> 
		{
			accountService.withdraw(balance, amount);
		});
	}

	@Test
	void shouldNotThrowExceptionWhenBalanceIsInsufficient() {
		// Arrange
		AccountService service = new AccountService();
		double balance = 1000.0;
		double amount = 150.0;

		// Act & Assert
		assertDoesNotThrow( () -> service.withdraw(balance, amount));
	}

}
