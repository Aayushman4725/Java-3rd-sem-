class SavingsAccount{
    private double savingsBalance;
    private static double annualInterestRate;
    public SavingsAccount(double balance){
        
        this.savingsBalance = balance;
    }
    public void addInterest(double intrest){
        System.out.println(intrest);
        this.savingsBalance += intrest;
    }
    public double getBalance(){
        return savingsBalance;
    }
    public void calculateMonthlyInterest(){
        addInterest(savingsBalance*annualInterestRate/100/12);
    }
    public static void functionmodifyInterestRate(double newInterestRate){
        annualInterestRate = newInterestRate;
    }
} 
public class Test4{
    public static void main(String []args){
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);
        SavingsAccount.functionmodifyInterestRate(3);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("Saver1 balance: " + saver1.getBalance());
        System.out.println("Saver2 balance: " + saver2.getBalance());
        System.out.println("changing the Intrest reate to 5%");
        SavingsAccount.functionmodifyInterestRate(5);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("Saver1 next month balance: " + saver1.getBalance());
        System.out.println("Saver2 next month balance: " + saver2.getBalance());
    }
}
