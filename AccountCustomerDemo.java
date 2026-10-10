public class AccountCustomerDemo {
    public static void main(String[] args) {
        Customer cust = new Customer("Hari", "Fitra");
        Account acc = new Account(100000);
        cust.setAccount(acc);
 
        System.out.println("Nama: " + cust.getFirstName() + " " + cust.getLastName());
        System.out.println("Saldo awal: " + cust.getAccount().getBalance());
 
        cust.getAccount().deposit(50000);
        System.out.println("Setelah deposit 50000: " + cust.getAccount().getBalance());
 
        boolean success = cust.getAccount().withdraw(30000);
        System.out.println("Withdraw 30000 berhasil? " + success);
        System.out.println("Saldo akhir: " + cust.getAccount().getBalance());
    }
} 
