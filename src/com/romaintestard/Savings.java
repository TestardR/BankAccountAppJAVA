package com.romaintestard;

public class Savings extends Account {
    // List specific properties for a savings account
    private int safetyDepositBoxID;
    private int safetyDeposiBoxKey;

    // Constructor to initialize savings account properties
    public Savings(String name, String SSN, double initDeposit){
        super(name, SSN, initDeposit);
        accountNumber = "1" + accountNumber;
  /*      System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
        System.out.println("NEW SAVINGS ACCOUNT");*/
        setSafetyDepositBox();
    }

    private void setSafetyDepositBox() {
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        safetyDeposiBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }

    @Override
    public void setRate() {
        rate = getBaseRate() - .25; // rate is available in account;
    }


    // List any methods specific to the savings account

    public void showInfo() {
/*        System.out.println("ACCOUNT TYPE: Savings");*/
        super.showInfo();
        System.out.println(
                "Your Savings Account Features"
                + "\nSafety Deposit Box ID: " + safetyDepositBoxID
                + "\nSafety Deposit Box Key " + safetyDeposiBoxKey
        );
    }
}
