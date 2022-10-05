import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Getting the bill, tip percent, and number of people
        System.out.println("Please enter the bill amount: ");
        double bill = input.nextDouble();
        System.out.println("Please enter a tip percentage: ");
        int tip = input.nextInt();
        System.out.println("Please enter the number of people: ");
        int people = input.nextInt();

        // Calculating the total tip amount, total bill including tip, tip per person, and total per person
        double totalTipAmount = (int) ((bill*(tip/100.0))*100)/100.0;
        double totalBillIncludingTip = bill + totalTipAmount;
        double tipPerPerson = (int) ((totalTipAmount/people)*100)/100.0;
        double totalPerPerson = (int) ((totalBillIncludingTip/people)*100)/100.0;

        // Print the amounts
        System.out.println("Total Tip Amount: " + totalTipAmount);
        System.out.println("Total Bill Including Tip: " + totalBillIncludingTip);
        System.out.println("Tip per person: " + tipPerPerson);
        System.out.println("Total per person: " + totalPerPerson);
    }
}