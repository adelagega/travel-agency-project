package model;

public class InvalidAgeException extends Exception {

    public InvalidAgeException(){
        super("Age is not valid. Customer must be 18 or older.");
    }
}
