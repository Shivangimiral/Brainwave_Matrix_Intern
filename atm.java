// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class ATM {
   private static double balance = 1000.0;

   public ATM() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Welcome to the ATM");

      int var2;
      do {
         System.out.println("\n1. Check Balance");
         System.out.println("2. Deposit Money");
         System.out.println("3. Withdraw Money");
         System.out.println("4. Exit");
         System.out.print("Enter your choice: ");
         var2 = var1.nextInt();
         switch (var2) {
            case 1:
               checkBalance();
               break;
            case 2:
               depositMoney(var1);
               break;
            case 3:
               withdrawMoney(var1);
               break;
            case 4:
               System.out.println("Thank you for using the ATM. Goodbye!");
               break;
            default:
               System.out.println("Invalid choice. Please try again.");
         }
      } while(var2 != 4);

      var1.close();
   }

   private static void checkBalance() {
      System.out.printf("Your current balance is: $%.2f%n", balance);
   }

   private static void depositMoney(Scanner var0) {
      System.out.print("Enter the amount to deposit: ");
      double var1 = var0.nextDouble();
      if (var1 > 0.0) {
         balance += var1;
         System.out.printf("$%.2f has been deposited to your account.%n", var1);
         checkBalance();
      } else {
         System.out.println("Invalid amount. Please enter a positive value.");
      }

   }

   private static void withdrawMoney(Scanner var0) {
      System.out.print("Enter the amount to withdraw: ");
      double var1 = var0.nextDouble();
      if (var1 > 0.0) {
         if (var1 <= balance) {
            balance -= var1;
            System.out.printf("$%.2f has been withdrawn from your account.%n", var1);
            checkBalance();
         } else {
            System.out.println("Insufficient funds.");
         }
      } else {
         System.out.println("Invalid amount. Please enter a positive value.");
      }

   }
}
