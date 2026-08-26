/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.decionelseapp;

import java.util.Scanner;

/**
 *
 * @author emeris
 */
public class DecionElseApp 
{

    public static void main(String[] args) 
    {
       
        
      //  int correctPasscode = 4875;
     
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter your passcode: ");
        int enteredPasscode = scanner.nextInt() ;

        if (enteredPasscode ==4554 ) 
        {
            System.out.println("Welcome! Access granted.");
        } else 
        {
            System.out.println("Incorrect passcode. Try again.");
        }
        
        scanner.close();
        
    }
}
