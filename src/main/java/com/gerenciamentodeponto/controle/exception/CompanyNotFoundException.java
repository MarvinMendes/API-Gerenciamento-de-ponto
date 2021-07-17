package com.gerenciamentodeponto.controle.exception;

public class CompanyNotFoundException extends Exception {
    public CompanyNotFoundException(Long id) {
        super(String.format("Company with the id %s was not founded in the database", id));
    }
}
