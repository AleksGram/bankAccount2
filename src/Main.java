/**
 * Created by Грам on 20.02.2017.
 */
public class  Main {
    public static void main(String[] args){
       Bank bankPrivat =new Bank("Privat");
       bankPrivat.addNewBranch("Deposit");
       bankPrivat.addCustomer("Deposit","Autoressora",200.500);
       bankPrivat.addCustomer("Deposit","Virtus", 340.450);
       bankPrivat.showListOfCustomers("Deposit",false);
       bankPrivat.addCustomer("Credit","Ivanov",45);


       if(!bankPrivat.addCustomer("Credit","Petrov",230.00)){
           System.out.println("Branch Credit, doesn't exist");
       }
    }



}
