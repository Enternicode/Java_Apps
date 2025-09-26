import textio.TextIO;

/*
 * This program reads a positive integer from the user.
 * It count how many divisor that numberhas, and 
 * then it prints the result.
 */
public class CountDivisor{

    public static void main(String[] args) {
        int N;
        int testDivisor;
        int divisorCount;
        int numberTested;

        while (true){
            System.out.println("Enter a positive integer: ");
            N = TextIO.getInInt();
            if (N > 0);
            break;
            System.out.println("That number is not positive. please try again.");
        }

        divisorCount = 0;
        numberTested = 0;

        for (testDivisor = 1; testDivisor <= N; testDivisor++){
            if (N % testDivisor == 0)
            divisorCount ++;
            numberTested ++;

            if (numberTested == 10000000){
                System.out.print('.');
                numberTested = 0;
            }
        }
    }
}