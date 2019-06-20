/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;
import java.util.Random;

/** This class takes String input plus,minus,divide and times
 * from user and execute the operation
 *
 * @author sivagamasrinivasan
 * date 06/20
 */
public class ArithmeticBase {
    
    public enum operations { PLUS, MINUS, TIMES, DIVIDE };
    
    public double x,y;

    double calculate(double x, double y) {
//        Scanner sc =new Scanner(System.in);
//        System.out.println("Enter String");
//        String s= sc.next();

        Random rand = new Random();
        int randomIndex = rand.nextInt(4);

        switch (operations.values()[randomIndex]) {
            case PLUS:
                System.out.println("Result of PLUS: ");
                return x + y;
            case MINUS:
                System.out.println("Result of MINUS: ");
                return x - y;
            case TIMES:
                System.out.println("Result of TIMES: ");
                return x * y;
            case DIVIDE:
                System.out.println("Result of DIVIDE: ");
                return x / y;
            default:
                throw new AssertionError("Unknown operations " + this);
        }
    }
}


