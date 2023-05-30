package model;

public class Customer  {

   private String customerID;
   private String name;
   private String email;
   private String contactNumber;

   public Customer(String customerID, String name, String email, String contactNumber) {
      this.customerID = customerID;
      this.name = name;
      this.email = email;
      this.contactNumber = contactNumber;
   }

   public String getCustomerID() {
      return customerID;
   }

   public void setCustomerID(String customerID) {
      this.customerID = customerID;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getContactNumber() {
      return contactNumber;
   }

   public void setContactNumber(String contactNumber) {
      this.contactNumber = contactNumber;
   }

   public void updateCustomerInformation(String customerID, String name, String email, String contactNumber){
      this.customerID=customerID;
      this.name=name;
      this.email=email;
      this.contactNumber=contactNumber;
   }
}
