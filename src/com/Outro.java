/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ricardo
 */
public class Outro {    
      int segundos = 1000;
      int minutos = segundos * 60;  // um minuto
        Outro(String minutosDefinidos){
            try {
                while(true){
                    if(!minutosDefinidos.isEmpty()){
                         Thread.sleep(Integer.parseInt(minutosDefinidos)  *  minutos);
                         System.out.println("Intervalo de "+minutosDefinidos+ " minutos.");
                    }
                    else{
                         Thread.sleep(4 *  minutos);
                    }
                    mexe();
                    System.out.println("Mexe Esse Mause!");
                }   
            } 
           catch (InterruptedException ex) {
                System.out.println("Errou meu amigo!");
            }
        }

    public static void mexe(){
          try {
              Robot ro = new Robot();
              ro.mouseMove(2000, 222);
              ro.mousePress(InputEvent.BUTTON1_DOWN_MASK);
              ro.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
          } catch (AWTException ex) {
              Logger.getLogger(Outro.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
        
}
