import java.util.Scanner;
import java.text.NumberFormat;

class Mortgage{
    
public static void main(String[] args){

    final byte months_in_year = 12;
    final byte percent = 100;

    Scanner userInput = new Scanner(System.in);
    System.out.print("Principle: ");
    int principleInput = userInput.nextInt();

    System.out.print("Annual Interest Rate: ");
    float annualInterest = userInput.nextFloat();
    float monthlyInterest = annualInterest /percent/months_in_year;

    System.out.print("Period (Years): ");
    byte mortgageInput = userInput.nextByte();
    int numberOfPayments = years * months_in_year;

    double mortgage = principle * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)/ (math.pow(1 + monthlyInterest, numberOfPayments)-1));
    String mortgageFormatted = NumberFormat.getCurrencyInstance();
    System.out.println("Mortage: " + mortgageFormatted);
    Math.pow(rate, mortgageInput);

 }
}