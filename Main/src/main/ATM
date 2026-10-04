/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author Welcome
 */
import java.util.Scanner;

public class Main {

    static class InvalidPINException extends Exception {
        InvalidPINException(String message) {
            super(message);
        }
    }

    static class InsufficientBalanceException extends Exception {
        InsufficientBalanceException(String message) {
            super(message);
        }
    }

    static class InvalidAmountException extends Exception {
        InvalidAmountException(String message) {
            super(message);
        }
    }

    static void checkPIN(int pin) throws InvalidPINException {
        if (pin != 3011) {
            throw new InvalidPINException("Invalid PIN");
        }
    }

    static double withdraw(double balance, double amount)
            throws InsufficientBalanceException, InvalidAmountException {

        if (amount <= 0) {
            throw new InvalidAmountException("Invalid withdrawal amount");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient balance"
            );
        }

        return balance - amount;
    }

    static double deposit(double balance, double amount)
            throws InvalidAmountException {

        if (amount <= 0) {
            throw new InvalidAmountException(
                "Invalid deposit amount"
            );
        }

        return balance + amount;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pin;
        double balance = 10000;
        int choice;

        try {

            System.out.println("================================");
            System.out.println("      ATM TRANSACTION SYSTEM");
            System.out.println("================================");

            System.out.print("Enter PIN: ");
            pin = sc.nextInt();

            checkPIN(pin);

            System.out.println("Login Successful!");

            while (true) {

                System.out.println("\n========== ATM MENU ==========");
                System.out.println("1. Check Balance");
                System.out.println("2. Withdraw Money");
                System.out.println("3. Deposit Money");
                System.out.println("4. Exit");
                System.out.println("==============================");

                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                try {

                    if (choice == 1) {

                        System.out.println(
                            "Current Balance: Rs." + balance
                        );

                    } 
                    else if (choice == 2) {

                        System.out.print(
                            "Enter withdrawal amount: "
                        );

                        double amount = sc.nextDouble();

                        balance = withdraw(balance, amount);

                        System.out.println(
                            "Withdrawal Successful!"
                        );

                        System.out.println(
                            "Remaining Balance: Rs." + balance
                        );

                    } 
                    else if (choice == 3) {

                        System.out.print(
                            "Enter deposit amount: "
                        );

                        double amount = sc.nextDouble();

                        balance = deposit(balance, amount);

                        System.out.println(
                            "Deposit Successful!"
                        );

                        System.out.println(
                            "New Balance: Rs." + balance
                        );

                    } 
                    else if (choice == 4) {
                        
                        System.out.println(
                            "Thank you for using ATM."
                        );

                        break;

                    } 
                    else {

                        System.out.println(
                            "Invalid choice."
                        );
                    }

                } catch (InsufficientBalanceException e) {

                    System.out.println(
                        "Error: " + e.getMessage()
                    );

                } catch (InvalidAmountException e) {

                    System.out.println(
                        "Error: " + e.getMessage()
                    );

                } finally {

                    System.out.println(
                        "Transaction completed."
                    );
                }
            }

        } catch (InvalidPINException e) {

            System.out.println(
                "Error: " + e.getMessage()
            );

        } catch (Exception e) {

            System.out.println(
                "Invalid input."
            );

        } finally {

            System.out.println(
                "ATM session closed."
            );
        }

        sc.close();
    }
}
                    