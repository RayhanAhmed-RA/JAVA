
package beginnerjava;

import java.util.Scanner;

public class InputDemo {


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
       
        //Example for string
        /*
        String name;
        
        System.out.print("Enter Your Name : ");
        name = input.nextLine();
        System.out.println("Welcome: = "+name);
        */
        
        //Example for Integer value
        int number;
       
        System.out.print("Enter Any Number : ");
        number = input.nextInt();
        System.out.println("Number: ="+number);
        
        /*
        //Example for double value
        double num1;
        System.out.print("Enter Your Double Value : ");
        num1 = input.nextDouble();
        System.out.println(num1);
        */
    }
    
}
