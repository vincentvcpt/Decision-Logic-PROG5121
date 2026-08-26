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
       // System.out.println("Hello World! VM");
        
        String correctPassword = "mySecurePassword";
     
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String enteredPassword = scanner.nextLine();

        if (enteredPassword.equals(correctPassword)) 
        {
            System.out.println("Welcome! Access granted.");
        } else 
        {
            System.out.println("Incorrect password. Try again.");
        }
        
        scanner.close();
        
    }
}
