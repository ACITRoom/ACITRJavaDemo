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
    
    private final GpioController gpio = GpioFactory.getInstance();    
    private GpioPinDigitalOutput  GPIOPinOutput = null; 
    
     //======================================================================================================================================                
     public boolean GPIOPin00OutputInitialFun(boolean IsHigh){
        try{           
            if (IsHigh == true){
                this.GPIOPinOutput =  gpio.provisionDigitalOutputPin(RaspiPin.GPIO_00, "GPIO 00", PinState.HIGH);                   
            }
            else {
                this.GPIOPinOutput =  gpio.provisionDigitalOutputPin(RaspiPin.GPIO_00, "GPIO 00", PinState.LOW);  
            }                    
            return true;
        }catch (Exception ex){
             DebugLogFun(new Object(){}.getClass().getEnclosingMethod().getName(),ex.toString(), ex.getMessage());
        }
        return false;
    }
    //======================================================================================================================================         
     public boolean GPIOOuputSetHighFun(){
           
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
      public boolean GPIOOuputSetToggleFun(){
           
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
      public boolean GPIOOuputSetLowFun(){
           
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
