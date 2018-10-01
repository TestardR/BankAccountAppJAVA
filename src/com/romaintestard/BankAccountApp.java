package com.romaintestard;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

    public static void main(String[] args) {
        List<Account> accounts = new LinkedList<Account>();


        // Read a CSV file then create a new accounts based on that data
        String file = "C:\\Users\\Romain\\Desktop\\Dev web\\JavaPrograms\\BankApplication\\NewBankAccounts.csv";
        List<String[]> newAccountHolders = utilities.CSV.read(file);
        for (String[] accountHolder : newAccountHolders) {
            String name = accountHolder[0];
            String SSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
/*            System.out.println(name + " " + SSN + " " + accountType + " $" + initDeposit);*/
            if(accountType.equals("Savings")) {
                accounts.add(new Savings(name, SSN, initDeposit));
            } else if (accountType.equals("Checking")) {
                accounts.add(new Checking(name, SSN, initDeposit));
            } else {
                System.out.println("Error reading account type");
            }
        }

        for (Account acc : accounts){ // Loop through all accounts
            System.out.println("****************");
            acc.showInfo();
        }
    }
}
