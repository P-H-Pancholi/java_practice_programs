public class BankAccount {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;
    public BankAccount(){
        this("1234",1000.23,"Default Name","Default address",
                "Default Number");
        System.out.println("Empty constructor called");
    }
    public BankAccount(String number,double balance,String customerName,String customerEmailAddress,
                       String customerPhoneNumber){
        System.out.println("Constructor with parameters called:");
        this.balance = balance;
        this.number = number;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;

    }

    public void setNumber(String number){
        this.number = number;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setCustomerEmailAddress(String customerEmailAddress){
        this.customerEmailAddress = customerEmailAddress;
    }
    public void setCustomerPhoneNumber(String customerPhoneNumber){
        this.customerPhoneNumber = customerPhoneNumber;
    }
    public String getNumber(){
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public String  getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void depositFunds(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of "+depositAmount +" made, New balance is : " + this.balance );
    }

    public void withdrawFunds(double withdrawAmount){
        if(this.balance < withdrawAmount){
            System.out.println("insufficient Balance, Withdraw not processed");
        }else{
            this.balance -= withdrawAmount;
            System.out.println("Withdraw of " + withdrawAmount +" made , New balance is : " + this.balance);
        }
    }
}
