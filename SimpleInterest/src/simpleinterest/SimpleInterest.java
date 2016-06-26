/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleinterest;
import java.util.Scanner;
/**
 *
 * @author dell
 */
public class SimpleInterest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double principle, time, rate, SI;
        Scanner input= new Scanner(System.in);
        
        System.out.println("Enter The Principle: ");
        principle=input.nextInt();
        System.out.println("Enter The Time: ");
        time= input.nextInt();
        System.out.println("Ente The Rate: ");
        rate= input.nextInt();
        
        SI=((principle*time*rate)/100);
        System.out.println("The simple interest: "+SI +"%");
        
        
        
        
    }
    
}
