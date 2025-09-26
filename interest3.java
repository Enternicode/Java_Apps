import textio.TextIO;
/*
 * This class implment a simple program that will compute the amount of
 * interest that is earned on an investment over a period of 5 years.
 * initial amount of hte investment and the interest rate are input by the 
 * user. The value of the investment at the end of each year is output.
 */

 public class interest3{

    public static void main(String[] args) {
        
        double principal; // the value of the investment.
        double rate;      // the annual interest rate.

        /* Get the initial investment and interest rate from the user.  */
         
        System.out.println("Enter the initial investment: ");
        principal = TextIO.getInDouble();

        System.out.println();
        System.out.println("Enter the annual interest rate.");
        System.out.println("Enter a decimal, not a percentage: ");
        rate = TextIO.getInDouble();
        System.out.println();

        /* Simulate the investment for 5 years.  */

        int years;
        years = 0;
        while( years < 5){
            double interest;  //interest for this year.
            interest = principal * rate;
            principal = principal* interest;
            years =+ 1 ;
            System.out.print ("The value of hte investment after ");
            System.out.print( years);
            System.out.print(" years is $");
            System.out.printf ("%1.2f", principal);
            System.out.println();
        }//end of while loop
    }  // end of main()
 } //end of class interest3