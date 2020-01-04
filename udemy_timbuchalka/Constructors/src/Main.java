public class Main {
    public static void main(String[] args) {
//        BankAccount bobsAccount = new BankAccount();
//        bobsAccount.depositFunds(1000.50);
//        bobsAccount.withdrawFunds(500.75);
//        bobsAccount.withdrawFunds(100.25);
//        bobsAccount.depositFunds(400.80);
        //Create a class VipCustomer
        // it should have 3 fields name, credit limit and email address
        // Create 3 constructor
        // 1st Constructor empty should call the constructor with 3 parameters
        // with default values 2nd should pass on 2 values it receives and add
        // a default value for 3rd one
        // 3rd should save all the fields
        // create getters only
        VipAccount tomsAccount = new VipAccount();
        System.out.println("name = " + tomsAccount.getName() + " credit limit is " + tomsAccount.getCredit_limit()
        + " and email is " + tomsAccount.getEmailAddress());
    }
}