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
        
        public static boolean login(String username, String password) 
        
    {
        String correctUsername = "student";
        String correctPassword = "12345";

        return username.equals(correctUsername) && password.equals(correctPassword);
    }

    public static void displayStudentInfo() 
    {
        System.out.println("Student Name: Megan Wallis");
        System.out.println("Year of Study: 1st Year");
        System.out.println("Group: BCAD0701");
        System.out.println("Module: Programming");
        System.out.println("Qualification: Bachelor of Computer and Information Science");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = input.nextLine();

        System.out.print("Enter password: ");
        String password = input.nextLine();

        if (login(username, password)) 
        
        {
            System.out.println("Access granted. Welcome to the School of Computer Science LMS 2026.");
            displayStudentInfo();
        } else 
        {
            System.out.println("Incorrect username/password. Goodbye. Please try again.");
        }

        input.close();
    }
}
        
