

/*public class evenOdd {

    static int number = 4; 
    //number is static variable
        public static void main(String[] args){ 
         System.out.println(number + 4); //no need to define a function
        }
    }*/

import java.util.Scanner;

/*class Example {
        int value = 10; // Non-static variable
    }
    public class Main {
        public static void main(String[] args) {
            Example obj = new Example(); // Create an object
            System.out.println(obj.value); // Accessing via the object
        }
    }*/



    public class evenOdd {
        public static int number = 4; // number is a static variable
    
       


        public static void main(String[] args) {

            if (number % 2 == 0) {
                System.out.println("a is even!");
            } else {
                System.out.println("a is odd!");
                
            }
            
        }
    }
    	class Counter {
        	    static int totalObjects = 0; // Shared among all instances
        	    Counter() {
        	        totalObjects++;
        	    }
    	}

        	class Car {
        	    String brand; // Each object has its own brand
        	    Car(String brand) {
                this.brand = brand;
        	    }
        	}

            class Num {
                int x = 5;
                System.out.println(x *= 2 + 3);
            }
            