/*
 * OT: To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptiondemos20170125;

import java.io.IOException;

/**
 *
 * @author Ogun otigli@gmail.com
 */
public class ExceptionDemos20170125 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("--- Exception Demo ---");

        try {
            int a = 100;
            int b = 0;

            int c = a / b;

            System.out.println("c is " + c);
        }
//        catch (IOException ex) {
//            System.out.println("IO Exception detected...");
//        }
        catch (ArithmeticException ex) {
            System.out.println("ArithmeticException: " + ex.getMessage());
        }
        catch (Exception ex) {
            System.out.println("Generic expception... " + ex.getMessage());
        }
        
        System.out.println("--- Done ---");
    }

}
