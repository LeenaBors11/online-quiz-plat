import java.util.*;

public class online_quiz_platform
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int balance=0;

        System.out.println("Wellcome to Simple Banking");

        while(true)
        {
            System.out.println("\nMenu: "
                              +"\n1] Deposite"
                              +"\n2]Withdraw"
                              +"\n3]Check Balance"
                              +"\n4]Exit");

            System.out.println("Enter your choice: ");
            int choice=sc.nextInt();

            switch (choice) 
            {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    int deposit = sc.nextInt();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("₹" + deposit + " deposited successfully.");
                    } else {
                        System.out.println("Invalid amount.");
                    }
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    int withdraw = sc.nextInt();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("₹" + withdraw + " withdrawn successfully.");
                    } else {
                        System.out.println("Invalid or insufficient funds.");
                    }
                    break;

                case 3:
                    System.out.println("Current balance: ₹"+ balance);
                    break;

                case 4:
                    System.out.println("Thank you for using Simple Banking!");
                    break;
            
                default:
                    System.out.println("Invide choice. Please try again.");
            }
            
        }

        //sc.close();
    }
}
