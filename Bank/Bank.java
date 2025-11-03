
import java.lang.Math;

public class Bank{
    public static void main(String[] args) {
    
        savAcc sAcc1 = new savAcc("Nawaal", 12345, "baigan", 1000000);
        currAcc cAcc1 = new currAcc("Razan", 12346, "bananana", 900, 1000);


        sAcc1.displayBal();
        sAcc1.deposit(10000);
        sAcc1.displayBal();
        sAcc1.withdraw(10000);
        sAcc1.displayBal();
        sAcc1.compInterest(5, 3);
        sAcc1.displayBal();
        
        cAcc1.displayBal();
        cAcc1.penalty(500);
        cAcc1.displayBal();
    }
}
class Account{

    String name;
    int number;
    String type;
    double balance;

    Account(String name, int number, String type, double balance){
        this.name = name;
        this.number = number;
        this.type = type;
        this.balance = balance;
    }

    void displayBal(){
        System.out.println("Account Number: "+this.number +"\nAccount Balance: "+this.balance);
    }

    void deposit(double amount){
        balance+= amount;
    }

    void withdraw(float amount){
        
        balance -= amount;
    }


}


class currAcc extends Account{

    double minBal;

    currAcc(String name, int number, String type, double balance, double minBal){
        super(name, number ,type,balance);
        this.minBal = minBal;
    }

    void displayBal(){
        System.out.println("Account Number: "+this.number +"\nAccount Balance: "+this.balance);
    }

    int checkBal(){
        if (balance<minBal){
            return 1;
        }
        return 0;
    }

    void penalty(double penalty){
        if (checkBal()==1){
            balance -= penalty;
        }
        return;
    }
}

class savAcc extends Account{


    savAcc(String name, int number, String type, double balance){
        
        super(name, number, type, balance);
    }



    void compInterest(double years, double interestPercentage){
        
        balance = balance*Math.pow((1.00+(interestPercentage/100)),years);
    }

}


