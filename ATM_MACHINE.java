import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ATM_MACHINE{
       
        int balance=5000;
        int pin=1234;
        Scanner scan= new Scanner(System.in);
        public void run(){
            List<String> history = new ArrayList<>();
        while(true){
            System.out.println("Enter PIN: ");
            int userInput = scan.nextInt();
            if(userInput==pin){

                System.out.println("1.A/C balance Inquiry");
                System.out.println("2.Cash Withdrawal");
                System.out.println("3.Cash Deposit");
                System.out.println("4.PIN Change");
                System.out.println("5.Transaction History");
                System.out.println("Choose an option: ");
                int option=scan.nextInt();
    
                switch(option){
                    case 1:
                        System.out.println("Blance:$"+balance);
                        break;
                    case 2:
                        System.out.println("Enter the amount to withdrawal:$");
                        int withdrawal=scan.nextInt();
                        if(withdrawal<=balance){
                            balance-=withdrawal;
                            history.add("Withdraw "+withdrawal);
                            System.out.println("Withdrawal successful");
                        }else{
                            System.out.println("Insufficient balance");
                        }
                            break;
                    case 3:
                         System.out.println("Enter the amount to deposit:$");
                         int deposit=scan.nextInt();
                         balance+=deposit;
                         history.add("Deposite "+deposit);
                         System.out.println("Deposit successful");
                         break;
                    case 4:
                        System.out.println("Enter new PIN:");
                        pin= scan.nextInt();
                        history.add("PIN changed");
                        System.out.println("PIN change successfully");
                        break;
                    case 5:
                        System.out.println("Transaction History: ");
                        for (String string : history) {
                            System.out.println(string);
                        }
                        break;
                    default:
                        System.out.println("Invalid choice");
                }

            }
            else{
                System.out.println("Incorrect PIN");
            }
            
        }
    }
    public static void main(String[] args) {
        ATM_MACHINE atm = new ATM_MACHINE();
        atm.run();
    }

}