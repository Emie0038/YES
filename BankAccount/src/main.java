import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        BankAccount account1 = new BankAccount("Jave Sumugat", 5000);
        BankAccount account2 = new BankAccount("Deljane Nillos", 6000);
        BankAccount account3 = new BankAccount("Christine Polido", 7000);
        BankAccount account4 = new BankAccount("Samantha Choing",4000);
        BankAccount account5 = new BankAccount("Karolina Smith",8000);

        account1.print();
        account1.withdraw(2000);
        account1.deposit(7000);
        account2.print();
        account2.withdraw(3000);
        account2.deposit(8000);
        account1.print();
        account3.withdraw(4000);
        account3.deposit(9000);
        account4.print();
        account4.withdraw(3000);
        account4.deposit(4000);
        account5.print();
        account5.withdraw(5000);
        account5.deposit(6000);



        Bank danske = new Bank("Danske");
        danske.addAccount(account1);
        danske.addAccount(account2);
        danske.addAccount(account3);
        danske.addAccount(account4);
        danske.addAccount(account5);

        danske.totalValue();
    }

}
