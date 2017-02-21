import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double>transaction;

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transaction=new ArrayList<Double>();
        addTransaction(initialAmount);
    }
    public void addTransaction(double amount){
        this.transaction.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransaction() {
        return transaction;
    }

    public void showCustomerTransactions(){
        for(int i=0;i<this.transaction.size();i++){
            System.out.println((i+1)+" tr "+transaction.get(i));
        }
    }
}
