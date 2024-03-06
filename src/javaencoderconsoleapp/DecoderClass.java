/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaencoderconsoleapp;

/**
 *
 * @author kennethyong
 */
public class DecoderClass extends ReferenceClass{

    public DecoderClass(char offset) {
        super(offset);
    }
    
    @Override
    void generateShiftTable(char offset) {
        int position = ReferenceTable.indexOf(offset);

        for(int i=0;i<ReferenceTable.length();i++){
            char originalChar = ReferenceTable.charAt(i);
            char shiftChar = ReferenceTable.charAt((i - position + ReferenceTable.length())%ReferenceTable.length());
            shiftTable.put(shiftChar, originalChar);
        }
    }

}
