/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package acitroomjavadeomo;

import pi4jOperator.pi4jMainOperator;

/**
 *
 * @author AlanChung
 */
public class ACITRoomJavaDeomo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        
        
        int timerCounter = 0;    
        pi4jMainOperator pi4jMainOperatorObj = new pi4jMainOperator();
        pi4jMainOperatorObj.InitialFun();
         for(;;){
                try {   
                    Thread.sleep(2000);
                    if ((timerCounter % 30) == 1){
                        System.out.println( "ACITRoom Java Deomo" +"==>" + " Running for 1 minute Counter Vaule =" + timerCounter);      
                    }
                     
                    if ((timerCounter % 300) == 1){
                    
                    }
                    timerCounter++;   
                    if (timerCounter > 10000000) timerCounter = 0;
                } catch (InterruptedException ex) {        
                    System.out.println( "ACIT Room Java Deomo" + "InterruptedException" + ex.getMessage());
                }
            }     
        
        
    }
    
}
