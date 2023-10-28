class Account{
    private int balance;

    public Account(){
        balance = 10000;
    }
    public void deposit(int amount){
        synchronized(this)
        {
            System.out.println("Balance before deposit "+balance);
            balance = balance+amount;
            System.out.println("Balance After deposit "+balance);
        }

    }

    public void withdraw(int amount){
        synchronized(this){
            System.out.println("Balance Before winthdraw : "+balance);
            balance = balance-amount;
            System.out.println("Balance after Withdraw : "+balance);
        }
    }

}

class AccountUser extends Thread{
    private String name,tot;
    private Account account;
    private int amount;


    public AccountUser(String n,Account acc,String tran,int amt){
        name = n;
        account = acc;
        tot = tran;
        amount = amt;

    }

    public void run(){
        if (tot.equals("deposit")){
            account.deposit(amount);
        }
        else if (tot.equals("withdraw")){
            account.withdraw(amount);
        }
    }
   
}

public class synchronised_thread {

    public static void main(String[] args) {
        Account account = new Account();
        AccountUser user1 = new AccountUser("abc", account, "deposit", 1000);
        AccountUser user2 = new AccountUser("pqre", account, "withdraw", 1000);

        user1.start();
        user2.start();
    }
    
}
