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
        
        int correctPasscode = 4875;
     
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String enteredPasscode = scanner.nextLine();

        if (enteredPasscode.equals(correctPasscode)) 
        {
            System.out.println("Welcome! Access granted.");
        } else 
        {
            System.out.println("Incorrect password. Try again.");
        }
        
        scanner.close();
        
    }
}
