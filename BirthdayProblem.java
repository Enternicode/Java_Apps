/*
 * Simulate choosing people at random and checking the day of the year they 
 * were born on. if the birthday is the same as one that was seen previously,
 * stop, and output the number of people who were checked
 */
public class BirthdayProblem{
    public static void main(String[] args){
        boolean[] used; //for recording the possiable birthdays
                        //that hava been seen so far. A value
                        //of true in used[i] means that a person
                        // whose birthday is the i-th day of the 
                        // year has been found

        int count;      //the number of people who have been checked

        used = new boolean[365]; // Initially, all entries are false.

        count = 0;
        while (true) {
            //select a birthday at random, from 0 to 365.
            //if the birthday has already been used quit.
            //Otherwise, record the birthday as used.

        int birthday; 
        birthday = (int)(Math.random()*365);
        count++;

        System.out.printf("Person %d has birthday number %d%n", count, birthday);
        if ( used[birthday]) {
            break;
        } 
        used[birthday ] = true;
        } //
        System.out.println();
        System.out.println("A duplicate birthday was found after " + count + " tries.");
    }
    
}