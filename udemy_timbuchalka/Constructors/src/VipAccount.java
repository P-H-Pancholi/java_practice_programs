public class VipAccount {
    private String name;
    private int credit_limit;
    private String emailAddress;

    public VipAccount(String name, int credit_limit,String emailAddress){
        System.out.println("Constructor with 3 parameters");
        this.name = name;
        this.credit_limit = credit_limit;
        this.emailAddress = emailAddress;
    }
    public VipAccount(){
        this("Tom parker",10000,"tom@123.com");
        System.out.println("Empty Constructor");
    }
    public VipAccount(String name,String emailAddress){
        this(name,9000,emailAddress);
        System.out.println("Constructor with 2 parameters");
    }
    public String getName(){
        return this.name;
    }
    public int getCredit_limit(){
        return this.credit_limit;
    }
    public String getEmailAddress(){
        return this.emailAddress;
    }
}
