public class BankAccount {
    String name;
    double balance;


    public BankAccount (String name, double balance){
        this.name=name;
        this.balance=balance;

    }

    public void print(){
        System.out.println("Amount was withdrawn by "+this.name);
        System.out.println("Amount deposited "+this.balance+ " "+"dkk");

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }


    public void withdraw(double amount){
        double balance = amount - this.balance;
        System.out.println("after withdraw "+ amount+ "Dkk");
        setBalance(balance);
    }

    public void deposit(double amount){
        double balance = amount + this.balance;
        //this.balance+=amount;
        System.out.println("The total balance after deposited "+ amount + "Dkk");
        setBalance(balance);

    }
}

