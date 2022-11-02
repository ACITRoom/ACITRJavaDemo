/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pi4jOperator;

/**
 *
 * @author AlanChung
 */
public class pi4jMainOperator extends pi4j01GPIO01Output {
    
    public pi4jMainOperator() {
        
    }
    
    public boolean InitialFun(){
         try{
            if (GPIOPin00InputInitialFun() == false){
                DebugLogFun(new Object(){}.getClass().getEnclosingMethod().getName(),"GPIOPin00InputInitialFun","Failed");     
            }
            if (GPIOPin01OutputInitialFun(true) == false){
                DebugLogFun(new Object(){}.getClass().getEnclosingMethod().getName(),"GPIOPin01OutputInitialFun","Failed");     
            } 
            return true;
        }catch (SecurityException ex){
             DebugLogFun(new Object(){}.getClass().getEnclosingMethod().getName(),"Main", ex.getMessage());
        }
        return false;
    }
            
    
    
    
}
