/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaencoderconsoleapp;

/**
 *
 * @author kennethyong
 */
public class JavaEncoderConsoleApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = "BHELLO WORLD";
        input = input.toUpperCase();
    
        try {
            if (input.isEmpty()) {
                throw new IllegalArgumentException("Input string cannot be empty");
            }
            if (input.length() < 2) {
                throw new IllegalArgumentException("Input string must have at least 2 characters");
            }
            
            String plaintext = plaintext(input);
            char offset = offsetChar(input);

            ReferenceClass encoder = new EncoderClass(offset);
            ReferenceClass decoder = new DecoderClass(offset);

            String encodedStr = encoder.processText(plaintext);
            String decodedStr = decoder.processText(encodedStr);

            System.out.println("Original input: "+input);
            System.out.println("First charater input: "+offset);
            System.out.println("Plantext input: "+plaintext);
            System.out.println("Encoded string: "+encodedStr);
            System.out.println("Decoded string: "+decodedStr);
            
        
        }catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
            
        }

    }
    
    private static char offsetChar (String input){
        return input.charAt(0);
    }
    private static String plaintext (String input){
        return input.substring(1);
    }
    
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

