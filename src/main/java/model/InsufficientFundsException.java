package model;

public class InsufficientFundsException extends Exception{
    public InsufficientFundsException() {
        super("Insufficent Funds");
    }
}
