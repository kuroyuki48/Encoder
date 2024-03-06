/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaencoderconsoleapp;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author kennethyong
 */
abstract class ReferenceClass {
    protected final String ReferenceTable = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789()*+,-./";
    protected Map<Character, Character> shiftTable = new HashMap<>();

    public ReferenceClass(char offset) {
        generateShiftTable(offset);
        
    }
    abstract void generateShiftTable(char offset);
    
    public String processText(String input){
        char[] charArr = input.toCharArray();
        StringBuffer buff = new StringBuffer();
        for(char c : charArr){
            Character temp = shiftTable.get(c);
            
            if(temp != null){
                buff.append(shiftTable.get(c));
            } else {
                buff.append(c);
            }
            
        }
        return buff.toString();
    }

}
