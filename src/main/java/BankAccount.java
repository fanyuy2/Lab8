import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /**
     * The possible types of a bank account.
     */
    public enum BankAccountType {
        /**
         * The.
         */
        CHECKINGS,

        /**
         * The.
         */
        SAVINGS,

        /**
         * The.
         */
        STUDENT,

        /**
         * The.
         */
        WORKPLACE
    }
    /** The the account numeber.
     *
     */
    private int accountNumber;

    /** The type of the bank.
     *
     */
    private BankAccountType accountType;

    /**
     * The amount of money in the account.
     */
    private double accountBalance;

    /**
     * the name of the owner of the account.
     */
    private String ownerName;

    /**
     * The interest rate of the account.
     */
    private double interestRate;

    /**
     * The interest earned by this account.
     */
    private double interestEarned;

    /**
     * create a new account.
     * @param name the name of the owner
     * @param accountCategory the type of the account
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        ownerName = name;
        accountType = accountCategory;
        System.out.println("A new account is created.");
    }

    /**
     * Set the account number.
     * @param number the number typed in
     */
    public void setAccountNumebr(final int number) {
        accountNumber = number;
    }
    /**
     * Get the account Number.
     * @return return the account Number
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Set the type of the account.
     *
     *@param accountCategory the type of the account
     */
    public void setAccountType(final BankAccountType accountCategory) {
        accountType = accountCategory;
    }

    /**
     * Get the type of the account.
     * @return the type of the account
     */
    public BankAccountType getAccountType() {
        return accountType;
    }

    /**
     * Set the account balance.
     * @param balance the balance of the account
     */
    public void setAccountBalance(final double balance) {
        accountBalance = balance;
    }

    /**
     * Get the current balance of the account.
     * @return the current balance of the account
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * Reset the owner of the account.
     * @param owner the new owner of the account
     */
    public void setOwnerName(final String owner) {
        ownerName = owner;
    }

    /**
     * Get the current owner's name.
     * @return the current owner's name
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Set the interest rate of the account.
     * @param rate the interest rate of the account.
     */
    public void setInterestAccount(final double rate) {
        interestRate = rate;
    }

    /**
     * Get the current interest rate of the account.
     * @return the current interest rate of the account
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * Set the current interest earned.
     * @param interest the current interest earned
     */
    public void setInterestEarned(final double interest) {
        interestEarned = interest;
    }

    /**
     * Get the current interest earned.
     * @return the current interest earned
     */
    public double getInterstEarned() {
        return interestEarned;
    }
}