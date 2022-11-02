/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pi4jOperator;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;

/**
 *
 * @author AlanChung
 */
public abstract class pi4j01GPIO00Output extends pi4j01GPIO00Input {
    
  
    private GpioPinDigitalOutput  GPIOPinOutput = null;     
     //======================================================================================================================================                
     public boolean GPIOPin00OutputInitialFun(boolean IsHigh){
        try{           
         
            if (IsHigh == true){
                this.GPIOPinOutput =   GpioFactory.getInstance().provisionDigitalOutputPin(RaspiPin.GPIO_00, "GPIO00", PinState.HIGH);                   
            }
            else {
                this.GPIOPinOutput =   GpioFactory.getInstance().provisionDigitalOutputPin(RaspiPin.GPIO_00, "GPIO00", PinState.LOW);  
            }                    
            return true;
        }catch (Exception ex){
             DebugLogFun(new Object(){}.getClass().getEnclosingMethod().getName(),ex.toString(), ex.getMessage());
        }
        return false;
    }
    //======================================================================================================================================         
     public boolean GPIO00OuputSetHighFun(){
           
        try{
            if (GPIOPinOutput == null){
                return false;
            }
            this.GPIOPinOutput.setState(PinState.HIGH);           
            return true;
        }catch (Exception ex){
             DebugLogFun(new Object(){}.getClass().getEnclosingMethod().getName(),"Main", ex.getMessage());
        }
        return false;
     }
     //======================================================================================================================================        
      public boolean GPIO00OuputSetToggleFun(){
           
        try{
            if (GPIOPinOutput == null){
                return false;
            }
            this.GPIOPinOutput.toggle();
            
            return true;
        }catch (Exception ex){
             DebugLogFun(new Object(){}.getClass().getEnclosingMethod().getName(),ex.toString(), ex.getMessage());
        }
        return false;
     }
     
     //======================================================================================================================================          
      public boolean GPIO00OuputSetLowFun(){
           
        try{
            if (GPIOPinOutput == null){
                return false;
            }
            this.GPIOPinOutput.setState(PinState.LOW);
            
            return true;
        }catch (Exception ex){
             DebugLogFun(new Object(){}.getClass().getEnclosingMethod().getName(),ex.toString(), ex.getMessage());
        }
        return false;
     }
        //======================================================================================================================================     
}
