/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pi4jOperator;

/**
 *
 * @author AlanChung
 */
public abstract class pi4j00operator {
    
    
    
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
    protected void DebugLogFun( String MinorHeader, String LogMessage, String AdditionalMessage){
       System.out.println("ACITRoom =>" + this.getClass().getSimpleName() +"+"+ MinorHeader +"+"+ LogMessage +"+"+ AdditionalMessage);
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////      
    
    
}
