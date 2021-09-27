import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<BankAccount> bankList  = new ArrayList<BankAccount>();
    public Bank (String name){
        this.name= name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public ArrayList <BankAccount> getBankList(){
        return bankList;
    }
    public void setBankList(ArrayList<BankAccount>bankList){
        this.bankList=bankList;
    }

    public void addAccount(Bank bankAccount){
        bankList.add(bankAccount);
        System.out.println("Another bank account was added "+ getName());
        System.out.println(bankAccount);
    }
    public void totalValue() {
        int totalValue=0;

        for (int i = 0; i< bankList.size();i++){
            totalValue += bankList.get(i).getBalance();
        }
        System.out.println("The total value in the "+ getName()+"of the bank is "+ totalValue + "Dkk");
    }

}
