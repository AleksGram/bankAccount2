import java.util.ArrayList;

/**
 * Created by Грам on 20.02.2017.
 */
public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addNewCustomer(String customerName, double initialAmount) {
        if (findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName) {
        for (int i = 0; i < customers.size(); i++) {
            Customer checkedCustomer = customers.get(i);
            if (checkedCustomer.getName().equals(customerName)) {
                return checkedCustomer;
            }

        }
        return null;
    }

    public void showTransaction(String customerName) {
        Customer checkedCustomer = findCustomer(customerName);
        System.out.println("Transactions of the " + customerName + ":");
        if (checkedCustomer != null) {
            checkedCustomer.showCustomerTransactions();
        } else
            System.out.println("Error: can't find the " + customerName + " customer");
        System.out.println();
    }
}
