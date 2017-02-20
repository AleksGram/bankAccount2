/**
 * Created by Грам on 20.02.2017.
 */
public class  Main {
    public static void main(String[] args){
        Branch branch = new Branch("Privat");
        branch.addNewCustomer("Silpo",100.00);
        branch.addCustomerTransaction("Silpo",150.00);
        branch.showTransaction("Silpo");
        branch.showTransaction("Virtus");
    }

}
