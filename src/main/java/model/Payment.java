package model;

   public interface Payment {

   boolean makePayment(double amount)throws InsufficientFundsException ;
   boolean refundPayment(double amount);
   double getBalance();
}
