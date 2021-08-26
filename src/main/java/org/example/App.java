/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Turner
 */
package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App
{
    public static void main( String[] args )
            throws IOException
    {
        System.out.println("Please enter a string: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        int length = input.length();
        System.out.println(input + " Has " +length +" Characters.");

    }
}
