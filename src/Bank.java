import java.util.ArrayList;

/**
 * Created by Грам on 21.02.2017.
 */
public class Bank {
    private String name;
    ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addNewBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch existingBranch = findBranch(branchName);
        if (existingBranch != null) {
            return existingBranch.addNewCustomer(customerName, initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transactionAmount) {
        Branch transactionBranch = findBranch(branchName);
        if (transactionBranch != null) {
            return transactionBranch.addCustomerTransaction(customerName, transactionAmount);
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < branches.size(); i++) {
            Branch chekedBranch = branches.get(i);
            if (chekedBranch.equals(branchName)) {
                return chekedBranch;
            }
        }
        return null;
    }

    public boolean showListOfCustomers(String branchName, boolean showTransactions) {
        Branch customersBranch = findBranch(branchName);
        if (customersBranch != null) {
            ArrayList<Customer> listOfCustomers = customersBranch.getCustomers();
            for (int i = 0; i < listOfCustomers.size(); i++) {
                Customer customer = listOfCustomers.get(i);
                System.out.println((i + 1) + " " + customer.getName());

                if (showTransactions == true) {
                    customer.showCustomerTransactions();

                }
            }
            return true;
        } else {
            System.out.println("upsss..");
            return false;


        }

    }
}
