/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pi4jOperator;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalInput;
import com.pi4j.io.gpio.PinEdge;
import com.pi4j.io.gpio.PinPullResistance;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;
import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;

/**
 *
 * @author AlanChung
 */
public abstract class pi4j01GPIO00Input extends pi4j00operator {
    
    
    
    private final GpioController gpio = GpioFactory.getInstance();    
    private GpioPinDigitalInput  GPIOPinInput = null;  
    //====================================================================================================================================
    public boolean GPIOPin00InputInitialFun(){
        try{             
            this.GPIOPinInput = this.gpio.provisionDigitalInputPin(RaspiPin.GPIO_00, PinPullResistance.PULL_DOWN);           
            this.GPIOPinInput.addListener((GpioPinListenerDigital) (GpioPinDigitalStateChangeEvent event) -> {
                String PinName1 = event.getPin().getName();
                if (PinName1.contains(PinName1) == true){
                    if (event.getState() == PinState.HIGH){
                        DebugLogFun(new Object(){}.getClass().getEnclosingMethod().getName(),"======>>> PinName="+PinName1,"High State");
                     
                    }
                    else  if (event.getState() == PinState.LOW){
                        DebugLogFun(new Object(){}.getClass().getEnclosingMethod().getName(),"======>>> PinName="+PinName1,"Low State");
                       
                    }      
                     if (event.getEdge() == PinEdge.FALLING){
                        DebugLogFun(new Object(){}.getClass().getEnclosingMethod().getName(),"======>>> PinName="+PinName1,"FALLING");
                      
                    }  
                }
            });   // create GPIO listener
            return true;
        }catch (SecurityException ex){
             DebugLogFun(new Object(){}.getClass().getEnclosingMethod().getName(),"Main", ex.getMessage());
        }
        return false;
    }
    
}
