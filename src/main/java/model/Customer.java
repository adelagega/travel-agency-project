package model;

public class Customer implements Payment {
    private String name;
    private String lastName;
    private int age;
    private double balance;

    public Customer(String name, String lastName, int age, double balance)
            throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException();
        }
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.balance = balance;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public boolean makePayment(double amount) throws InsufficientFundsException{
        if(balance>=amount){
            balance-=amount;
            return true;
        }else{
            throw new InsufficientFundsException();
        }
    }
    public boolean refundPayment(double amount) {
        balance+=amount;
        return true;
    }
    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", balance=" + balance +
                '}';
    }
}
