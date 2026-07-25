package com.junitlearn.practice;

public class AccountService {

    public void withdraw(double balance, double amount) {

        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }

        // withdrawal logic
    }

    public Portfolio findPortfolio(Long id) {

    return repository.findById(id)
            .orElseThrow(() ->
                new PortfolioNotFoundException(
                    "Portfolio not found"
                ));
}
}
